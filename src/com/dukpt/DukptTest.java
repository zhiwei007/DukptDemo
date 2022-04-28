package com.dukpt;

public class DukptTest {
    public static void main(String[] args) {
        /*for ftsafe pos*/
        byte[] ipek = Util.hex2byte("E69BA53691E7C240AD122D3D4582E8D9");
        byte[] ksn = Util.hex2byte("00000007172700000001");
        byte[] keyRegister = Util.hex2byte("C0C0C0C000000000C0C0C0C000000000");
        BitSet keyRegisterBitmask =  Dukpt.toBitSet(keyRegister);
        byte[] data = Util.hex2byte("00000000000000FF00000000000000FF");
        BitSet dataVariantBitmask = Dukpt.toBitSet(data);

        try {
            BitSet  key = Dukpt._getCurrentKey(Dukpt.toBitSet(ipek), Dukpt.toBitSet(ksn),keyRegisterBitmask,dataVariantBitmask);
            System.out.println(Util.hexString(Dukpt.toByteArray(key)));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

//IPEK:E69BA53691E7C240AD122D3D4582E8D9
//KSN:00000007172700000001
//PEK:5893C620CFF22FA48C9C05F934B11FD4

// 5893C620CFF22FA48C9C05F934B11FD4
