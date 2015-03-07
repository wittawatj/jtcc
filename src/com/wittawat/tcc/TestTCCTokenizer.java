/*
 *   Copyright 2009, 2010 Wittawat Jitkrittum
 *   http://wittawat.com
 *
 *   This file is part of JTCC.
 *
 *   JTCC is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   JTCC is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with JTCC.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package com.wittawat.tcc;

/**
 *
 * @author Wittawat Jitkrittum
 */
public class TestTCCTokenizer {

    public static void main(String[] args) throws Exception {
        String allVowels = "นี่คือบททดสอบ TCC โดยรวมสระทั้งหมดสะช้ะมาบ้ากิถิ้บีดี้ขึงทึ่งรือขื่อกุตุ้บสูตู่เละเส๊ะเขเป้\n" +
                "และแฮ๊ะแบแร่โปะโก๊ะโลโน่วเพาะเล๋าะกอบ่อเยอะเบ๊อะเอยเน่อเพียะเยี๊ยะเปือก\r\n" +
                "เรือเสื่อผัวะยั๊วะฤาษีฤากล้ำนำใสใบ้ไปไร่เข้าเมาอัศเจรีย์อัศเจรียค่ำ\r" +
                " ต่อไปนี้ทดสอบ false positive " +
                "เบ็ดเสร็จเยน้าะเพร้าะเสสาะเบบอะเฝพ็รเบิน์นเทิ้นเมี้ยะแดด์แคร์แดกป์แหหห์อึนะ\n\n" +
                "ศาลออกหมายจับ\"สุภรณ์-ธีระชัย\"หนีฟังคำพิพากษาคดีหมิ่น\"มาร์ค\"ฮุบเงินซุกบัญชีพ่อ";
        
//        System.out.println(allVowels);
        String content =
//                "\n\n"
                allVowels
//                                "เครื่องมือสื่อสารมีหลายชนิดหม่อมแม่"
                //                "หันผัวะก็ค่ะถ้าน้ำมีดูเราเงาะเผี๊ยะเผียะเอือะเอื้อะและโละเป็นแม่ใจเมียเรือพ.ศ.2342 ๒๓๑English วิกฤต(*#("
//                                "เจ้าของบ้านจะต้องไปติดต่อที่การไฟฟ้านครหลวง หรือการไฟฟ้าส่วนภูมิภาคของเขตนั้นๆ เพื่อขออนุญาตใช้ไฟฟ้าเอ็ง\n" +
//                                "เอือะนะจ๊ะอรรนะควรรณรงค์ตลาด๒๒แกร่งเพราะฤ\u0E45อิอี๋นี่เคื่อะเบือจ้ะโอ่งโม่ใสไม่แลบ้างแร่งานเก็งเคร่าะเบยอะเคร่อะ"+
//                                "สวัสดีอัศเจรีย์นะ\r\n"
//                FileUtils.readFileToString(new File("ThaiTest.txt"))
                                ;
        TCCTokenizer tok = new TCCTokenizer(content);
        String tccs = tok.tokenize();
        System.out.println(tccs);

    }
}
