package com.example.study2;

public class FizzBuzz {

    int iFizzValue;
    int iBuzzValue;

    public FizzBuzz(int iFizz, int iBuzz) {

        this.iFizzValue = iFizz;
        this.iBuzzValue = iBuzz;
    }

    String FizzBuzzStrCheck(int iInputnum){

        //出力値
        String strOUTFIZZBUZZ = "";

        int iFizzFlag = 0;
        int iBuzzFlag = 0;

        //フラグ設定
        if (0 == (iInputnum % this.iFizzValue)) {
            iFizzFlag = 1;
        }

        if (0 == (iInputnum % this.iBuzzValue)) {
            iBuzzFlag = 1;
        }

        // iFizzFlagが立っている場合、FIZZを設定
        if (1 == iFizzFlag) {
            strOUTFIZZBUZZ = strOUTFIZZBUZZ + "FIZZ";
        }

        // iBuzzFlagが立っている場合、BUZZを設定
        if (1 == iBuzzFlag) {
            strOUTFIZZBUZZ = strOUTFIZZBUZZ + "BUZZ";
        }

        // フラグ立ってない場合、出力値に入力した値を設定
        if ((0 == iFizzFlag) && (0 == iBuzzFlag)) {
            strOUTFIZZBUZZ = String.valueOf(iInputnum);
        }


        return strOUTFIZZBUZZ;

    }
}
