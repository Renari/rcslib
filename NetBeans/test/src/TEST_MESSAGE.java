/*
*	New Java File starts here.
*	This file should be named TEST_MESSAGE.java
*	Automatically generated by NML CodeGen Java Applet.
*	from nml_test_format.hh:210
*	with command line arguments :  generate_for_all_langs=true HHFile=nml_test_format.hh
*
*	.gen script :
*		0:load nml_test_format.hh
*		1:clear
*		2:select_from_file nml_test_format.hh
*		3:generate C protos>nml_test_format_c_n.h
*		4:generate C format>nml_test_format_c_n.c
*		5:generate C update>nml_test_format_c_n.c
*		6:generate C++ protos>nml_test_format_n_codegen_protos.hh
*		7:generate C++ format>nml_test_format_n.cc
*		8:generate C++ update>nml_test_format_n.cc
*		9:generate C++ constructor>nml_test_format_n.cc
*		10:generate Java dict>nml_test_format_MsgDict.java
*		11:generate Java classes >*
*		12:generate Ada spec>nml_test_format_n_ada.ads
*		13:generate Ada body>nml_test_format_n_ada.adb
*		14:exit
*
*/

// Import all NML and posemath interfaces
import rcs.nml.*;
import rcs.posemath.*;

/*
*	Class definition for TEST_MESSAGE
*	Automatically generated by NML CodeGen Java Applet.
*/
public class TEST_MESSAGE extends TEST_MESSAGE_BASE implements Cloneable
{
	public byte byte_to_messup_msg = 0;
	public long first_count = 0;
	public struct_from_other_header sfoh = new struct_from_other_header();
	public boolean b = false;
	public byte c = 0;
	public double d = 0;
	public int i = 0;
	public float f = 0;
	public fwLaserStruct fw = new fwLaserStruct();

	public static NML_ENUM_INFO nml_enum_info_for_enumtest_typedef=null;
	public int etd =0; /* enum enumtest_typedef : zzz=0 */

	public static NML_ENUM_INFO nml_enum_info_for_enumtest_typedef2=null;
	public int etd2 =0; /* enum enumtest_typedef2 : www=0 */
	public byte big_array[] = new byte[1000];
	public boolean bool_array[] = new boolean[2];
	public int ia[] = new int[2];
	public byte ca[] = new byte[2];
	public float fa[] = new float[2];
	public double da[] = new double[2];
	public double two_d_array[] = new double[4];
	public double three_d_array[] = new double[8];
	public float f_pi = (float) 3.14159265;/* set by default comment */
	public int cda_length = 0;
	public byte cda[] = new byte[8]; /* NML_DYNAMIC_LENGTH_ARRAY */
	public double seventysevenpointseven = (double) 77.7;/* set by default comment */
	public int ida_length = 0;
	public int ida[] = new int[8]; /* NML_DYNAMIC_LENGTH_ARRAY */
	public double eightyeightpointeight = (double) 88.8;/* set by default comment */
	public int fda_length = 0;
	public float fda[] = new float[8]; /* NML_DYNAMIC_LENGTH_ARRAY */
	public int dda_length = 0;
	public double dda[] = new double[8]; /* NML_DYNAMIC_LENGTH_ARRAY */
	public teststruct s = new teststruct();
	public teststruct_td2 s_td2 = new teststruct_td2();
	public teststruct sa[] = new teststruct[2];
	public double d_pi = (double) 3.14159265;/* set by default comment */
	public int sda_length = 0;
	public teststruct sda[] = new teststruct[2]; /* NML_DYNAMIC_LENGTH_ARRAY */

	public static NML_ENUM_INFO nml_enum_info_for_enumtest=null;
	public int enumtestvar =0; /* enum enumtest : a=0 */
	public int enum_array[] = new int[5];
	public int enumtest_dla_length = 0;
	public int enumtest_dla[] = new int[7]; /* NML_DYNAMIC_LENGTH_ARRAY */
	public PM_CARTESIAN cart = new PM_CARTESIAN();
	public PM_CARTESIAN cart_array[] = new PM_CARTESIAN[3];
	public int cart_dla_length = 0;
	public PM_CARTESIAN cart_dla[] = new PM_CARTESIAN[5]; /* NML_DYNAMIC_LENGTH_ARRAY */
	public boolean do_int_size_test = false;
	public short smin = 0;
	public short smax = 0;
	public int i_smin = 0;
	public int i_smax = 0;
	public int imin = 0;
	public int imax = 0;
	public long l_imin = 0;
	public long l_imax = 0;
	public long lmin = 0;
	public long lmax = 0;
	public short usmax = 0;
	public int ui_usmax = 0;
	public int uimax = 0;
	public long ul_uimax = 0;
	public long ulmax = 0;
	public double d_ulmax = 0;
	public double d_lmin = 0;
	public double d_lmax = 0;
	public short s_array[] = new short[3];
	public int i_array[] = new int[3];
	public long l_array[] = new long[3];
	public short us_array[] = new short[2];
	public int ui_array[] = new int[2];
	public long ul_array[] = new long[2];
	public boolean false_bool = false;
	public boolean true_bool = false;
	public short sminusone = 0;
	public int iminusone = 0;
	public long lminusone = 0;
	public float fminusone = 0;
	public double dminusone = 0;
	public long last_count = 0;
	public teststruct teststruct_2d_array[] = new teststruct[4];
	public long lastvar = 0;


	// Constructor 
	public TEST_MESSAGE()
	{
		super(101);

		if(nml_enum_info_for_enumtest_typedef==null)
		{
			nml_enum_info_for_enumtest_typedef = new NML_ENUM_INFO();
			nml_enum_info_for_enumtest_typedef.name="enumtest_typedef";
			nml_enum_info_for_enumtest_typedef.string_to_int_hash = new java.util.Hashtable();
			nml_enum_info_for_enumtest_typedef.int_to_string_hash = new java.util.Hashtable();
			Integer I_enumtest_typedef=null;
			String Str_enumtest_typedef=null;
			I_enumtest_typedef= new Integer(2);
			Str_enumtest_typedef= "xxx";
			nml_enum_info_for_enumtest_typedef.int_to_string_hash.put(I_enumtest_typedef,Str_enumtest_typedef);
			nml_enum_info_for_enumtest_typedef.string_to_int_hash.put(Str_enumtest_typedef,I_enumtest_typedef);
			I_enumtest_typedef= new Integer(0);
			Str_enumtest_typedef= "zzz";
			nml_enum_info_for_enumtest_typedef.int_to_string_hash.put(I_enumtest_typedef,Str_enumtest_typedef);
			nml_enum_info_for_enumtest_typedef.string_to_int_hash.put(Str_enumtest_typedef,I_enumtest_typedef);
			I_enumtest_typedef= new Integer(1);
			Str_enumtest_typedef= "yyy";
			nml_enum_info_for_enumtest_typedef.int_to_string_hash.put(I_enumtest_typedef,Str_enumtest_typedef);
			nml_enum_info_for_enumtest_typedef.string_to_int_hash.put(Str_enumtest_typedef,I_enumtest_typedef);
		}


		if(nml_enum_info_for_enumtest_typedef2==null)
		{
			nml_enum_info_for_enumtest_typedef2 = new NML_ENUM_INFO();
			nml_enum_info_for_enumtest_typedef2.name="enumtest_typedef2";
			nml_enum_info_for_enumtest_typedef2.string_to_int_hash = new java.util.Hashtable();
			nml_enum_info_for_enumtest_typedef2.int_to_string_hash = new java.util.Hashtable();
			Integer I_enumtest_typedef2=null;
			String Str_enumtest_typedef2=null;
			I_enumtest_typedef2= new Integer(2);
			Str_enumtest_typedef2= "uuu";
			nml_enum_info_for_enumtest_typedef2.int_to_string_hash.put(I_enumtest_typedef2,Str_enumtest_typedef2);
			nml_enum_info_for_enumtest_typedef2.string_to_int_hash.put(Str_enumtest_typedef2,I_enumtest_typedef2);
			I_enumtest_typedef2= new Integer(0);
			Str_enumtest_typedef2= "www";
			nml_enum_info_for_enumtest_typedef2.int_to_string_hash.put(I_enumtest_typedef2,Str_enumtest_typedef2);
			nml_enum_info_for_enumtest_typedef2.string_to_int_hash.put(Str_enumtest_typedef2,I_enumtest_typedef2);
			I_enumtest_typedef2= new Integer(1);
			Str_enumtest_typedef2= "vvv";
			nml_enum_info_for_enumtest_typedef2.int_to_string_hash.put(I_enumtest_typedef2,Str_enumtest_typedef2);
			nml_enum_info_for_enumtest_typedef2.string_to_int_hash.put(Str_enumtest_typedef2,I_enumtest_typedef2);
		}

		for(int i_big_array = 0; i_big_array < 1000; i_big_array++ )
		{
			big_array[i_big_array]  = 0;
		}
		for(int i_bool_array = 0; i_bool_array < 2; i_bool_array++ )
		{
			bool_array[i_bool_array]  = false;
		}
		for(int i_ia = 0; i_ia < 2; i_ia++ )
		{
			ia[i_ia]  = 0;
		}
		for(int i_ca = 0; i_ca < 2; i_ca++ )
		{
			ca[i_ca]  = 0;
		}
		for(int i_fa = 0; i_fa < 2; i_fa++ )
		{
			fa[i_fa]  = 0;
		}
		for(int i_da = 0; i_da < 2; i_da++ )
		{
			da[i_da]  = 0;
		}
		for(int i_two_d_array = 0; i_two_d_array < 4; i_two_d_array++ )
		{
			two_d_array[i_two_d_array]  = 0;
		}
		for(int i_three_d_array = 0; i_three_d_array < 8; i_three_d_array++ )
		{
			three_d_array[i_three_d_array]  = 0;
		}
		for(int i_cda = 0; i_cda < 8; i_cda++ )
		{
			cda[i_cda]  = 0;
		}
		for(int i_ida = 0; i_ida < 8; i_ida++ )
		{
			ida[i_ida]  = 0;
		}
		for(int i_fda = 0; i_fda < 8; i_fda++ )
		{
			fda[i_fda]  = 0;
		}
		for(int i_dda = 0; i_dda < 8; i_dda++ )
		{
			dda[i_dda]  = 0;
		}
		for(int i_sa = 0; i_sa < 2; i_sa++ )
		{
			sa[i_sa] = new teststruct();
		}
		for(int i_sda = 0; i_sda < 2; i_sda++ )
		{
			sda[i_sda] = new teststruct();
		}

		if(nml_enum_info_for_enumtest==null)
		{
			nml_enum_info_for_enumtest = new NML_ENUM_INFO();
			nml_enum_info_for_enumtest.name="enumtest";
			nml_enum_info_for_enumtest.string_to_int_hash = new java.util.Hashtable();
			nml_enum_info_for_enumtest.int_to_string_hash = new java.util.Hashtable();
			Integer I_enumtest=null;
			String Str_enumtest=null;
			I_enumtest= new Integer(77);
			Str_enumtest= "dd";
			nml_enum_info_for_enumtest.int_to_string_hash.put(I_enumtest,Str_enumtest);
			nml_enum_info_for_enumtest.string_to_int_hash.put(Str_enumtest,I_enumtest);
			I_enumtest= new Integer(1);
			Str_enumtest= "b";
			nml_enum_info_for_enumtest.int_to_string_hash.put(I_enumtest,Str_enumtest);
			nml_enum_info_for_enumtest.string_to_int_hash.put(Str_enumtest,I_enumtest);
			I_enumtest= new Integer(0);
			Str_enumtest= "a";
			nml_enum_info_for_enumtest.int_to_string_hash.put(I_enumtest,Str_enumtest);
			nml_enum_info_for_enumtest.string_to_int_hash.put(Str_enumtest,I_enumtest);
			I_enumtest= new Integer(88);
			Str_enumtest= "e";
			nml_enum_info_for_enumtest.int_to_string_hash.put(I_enumtest,Str_enumtest);
			nml_enum_info_for_enumtest.string_to_int_hash.put(Str_enumtest,I_enumtest);
			I_enumtest= new Integer(2);
			Str_enumtest= "aa";
			nml_enum_info_for_enumtest.int_to_string_hash.put(I_enumtest,Str_enumtest);
			nml_enum_info_for_enumtest.string_to_int_hash.put(Str_enumtest,I_enumtest);
			I_enumtest= new Integer(3);
			Str_enumtest= "bb";
			nml_enum_info_for_enumtest.int_to_string_hash.put(I_enumtest,Str_enumtest);
			nml_enum_info_for_enumtest.string_to_int_hash.put(Str_enumtest,I_enumtest);
			I_enumtest= new Integer(99);
			Str_enumtest= "ccc";
			nml_enum_info_for_enumtest.int_to_string_hash.put(I_enumtest,Str_enumtest);
			nml_enum_info_for_enumtest.string_to_int_hash.put(Str_enumtest,I_enumtest);
		}

		for(int i_enum_array = 0; i_enum_array < 5; i_enum_array++ )
		{
			enum_array[i_enum_array]  = 0; /* enum enumtest : a=0 */
		}
		for(int i_enumtest_dla = 0; i_enumtest_dla < 7; i_enumtest_dla++ )
		{
			enumtest_dla[i_enumtest_dla]  = 0; /* enum enumtest : a=0 */
		}
		for(int i_cart_array = 0; i_cart_array < 3; i_cart_array++ )
		{
			cart_array[i_cart_array] = new PM_CARTESIAN();
		}
		for(int i_cart_dla = 0; i_cart_dla < 5; i_cart_dla++ )
		{
			cart_dla[i_cart_dla] = new PM_CARTESIAN();
		}
		for(int i_s_array = 0; i_s_array < 3; i_s_array++ )
		{
			s_array[i_s_array]  = 0;
		}
		for(int i_i_array = 0; i_i_array < 3; i_i_array++ )
		{
			i_array[i_i_array]  = 0;
		}
		for(int i_l_array = 0; i_l_array < 3; i_l_array++ )
		{
			l_array[i_l_array]  = 0;
		}
		for(int i_us_array = 0; i_us_array < 2; i_us_array++ )
		{
			us_array[i_us_array]  = 0;
		}
		for(int i_ui_array = 0; i_ui_array < 2; i_ui_array++ )
		{
			ui_array[i_ui_array]  = 0;
		}
		for(int i_ul_array = 0; i_ul_array < 2; i_ul_array++ )
		{
			ul_array[i_ul_array]  = 0;
		}
		for(int i_teststruct_2d_array = 0; i_teststruct_2d_array < 4; i_teststruct_2d_array++ )
		{
			teststruct_2d_array[i_teststruct_2d_array] = new teststruct();
		}

	}



	// Constructor that should be used by any classes that extend this class. 
	protected TEST_MESSAGE(int _type)
	{
		super(_type);

		if(nml_enum_info_for_enumtest_typedef==null)
		{
			nml_enum_info_for_enumtest_typedef = new NML_ENUM_INFO();
			nml_enum_info_for_enumtest_typedef.name="enumtest_typedef";
			nml_enum_info_for_enumtest_typedef.string_to_int_hash = new java.util.Hashtable();
			nml_enum_info_for_enumtest_typedef.int_to_string_hash = new java.util.Hashtable();
			Integer I_enumtest_typedef=null;
			String Str_enumtest_typedef=null;
			I_enumtest_typedef= new Integer(2);
			Str_enumtest_typedef= "xxx";
			nml_enum_info_for_enumtest_typedef.int_to_string_hash.put(I_enumtest_typedef,Str_enumtest_typedef);
			nml_enum_info_for_enumtest_typedef.string_to_int_hash.put(Str_enumtest_typedef,I_enumtest_typedef);
			I_enumtest_typedef= new Integer(0);
			Str_enumtest_typedef= "zzz";
			nml_enum_info_for_enumtest_typedef.int_to_string_hash.put(I_enumtest_typedef,Str_enumtest_typedef);
			nml_enum_info_for_enumtest_typedef.string_to_int_hash.put(Str_enumtest_typedef,I_enumtest_typedef);
			I_enumtest_typedef= new Integer(1);
			Str_enumtest_typedef= "yyy";
			nml_enum_info_for_enumtest_typedef.int_to_string_hash.put(I_enumtest_typedef,Str_enumtest_typedef);
			nml_enum_info_for_enumtest_typedef.string_to_int_hash.put(Str_enumtest_typedef,I_enumtest_typedef);
		}


		if(nml_enum_info_for_enumtest_typedef2==null)
		{
			nml_enum_info_for_enumtest_typedef2 = new NML_ENUM_INFO();
			nml_enum_info_for_enumtest_typedef2.name="enumtest_typedef2";
			nml_enum_info_for_enumtest_typedef2.string_to_int_hash = new java.util.Hashtable();
			nml_enum_info_for_enumtest_typedef2.int_to_string_hash = new java.util.Hashtable();
			Integer I_enumtest_typedef2=null;
			String Str_enumtest_typedef2=null;
			I_enumtest_typedef2= new Integer(2);
			Str_enumtest_typedef2= "uuu";
			nml_enum_info_for_enumtest_typedef2.int_to_string_hash.put(I_enumtest_typedef2,Str_enumtest_typedef2);
			nml_enum_info_for_enumtest_typedef2.string_to_int_hash.put(Str_enumtest_typedef2,I_enumtest_typedef2);
			I_enumtest_typedef2= new Integer(0);
			Str_enumtest_typedef2= "www";
			nml_enum_info_for_enumtest_typedef2.int_to_string_hash.put(I_enumtest_typedef2,Str_enumtest_typedef2);
			nml_enum_info_for_enumtest_typedef2.string_to_int_hash.put(Str_enumtest_typedef2,I_enumtest_typedef2);
			I_enumtest_typedef2= new Integer(1);
			Str_enumtest_typedef2= "vvv";
			nml_enum_info_for_enumtest_typedef2.int_to_string_hash.put(I_enumtest_typedef2,Str_enumtest_typedef2);
			nml_enum_info_for_enumtest_typedef2.string_to_int_hash.put(Str_enumtest_typedef2,I_enumtest_typedef2);
		}

		for(int i_big_array = 0; i_big_array < 1000; i_big_array++ )
		{
			big_array[i_big_array]  = 0;
		}
		for(int i_bool_array = 0; i_bool_array < 2; i_bool_array++ )
		{
			bool_array[i_bool_array]  = false;
		}
		for(int i_ia = 0; i_ia < 2; i_ia++ )
		{
			ia[i_ia]  = 0;
		}
		for(int i_ca = 0; i_ca < 2; i_ca++ )
		{
			ca[i_ca]  = 0;
		}
		for(int i_fa = 0; i_fa < 2; i_fa++ )
		{
			fa[i_fa]  = 0;
		}
		for(int i_da = 0; i_da < 2; i_da++ )
		{
			da[i_da]  = 0;
		}
		for(int i_two_d_array = 0; i_two_d_array < 4; i_two_d_array++ )
		{
			two_d_array[i_two_d_array]  = 0;
		}
		for(int i_three_d_array = 0; i_three_d_array < 8; i_three_d_array++ )
		{
			three_d_array[i_three_d_array]  = 0;
		}
		for(int i_cda = 0; i_cda < 8; i_cda++ )
		{
			cda[i_cda]  = 0;
		}
		for(int i_ida = 0; i_ida < 8; i_ida++ )
		{
			ida[i_ida]  = 0;
		}
		for(int i_fda = 0; i_fda < 8; i_fda++ )
		{
			fda[i_fda]  = 0;
		}
		for(int i_dda = 0; i_dda < 8; i_dda++ )
		{
			dda[i_dda]  = 0;
		}
		for(int i_sa = 0; i_sa < 2; i_sa++ )
		{
			sa[i_sa] = new teststruct();
		}
		for(int i_sda = 0; i_sda < 2; i_sda++ )
		{
			sda[i_sda] = new teststruct();
		}

		if(nml_enum_info_for_enumtest==null)
		{
			nml_enum_info_for_enumtest = new NML_ENUM_INFO();
			nml_enum_info_for_enumtest.name="enumtest";
			nml_enum_info_for_enumtest.string_to_int_hash = new java.util.Hashtable();
			nml_enum_info_for_enumtest.int_to_string_hash = new java.util.Hashtable();
			Integer I_enumtest=null;
			String Str_enumtest=null;
			I_enumtest= new Integer(77);
			Str_enumtest= "dd";
			nml_enum_info_for_enumtest.int_to_string_hash.put(I_enumtest,Str_enumtest);
			nml_enum_info_for_enumtest.string_to_int_hash.put(Str_enumtest,I_enumtest);
			I_enumtest= new Integer(1);
			Str_enumtest= "b";
			nml_enum_info_for_enumtest.int_to_string_hash.put(I_enumtest,Str_enumtest);
			nml_enum_info_for_enumtest.string_to_int_hash.put(Str_enumtest,I_enumtest);
			I_enumtest= new Integer(0);
			Str_enumtest= "a";
			nml_enum_info_for_enumtest.int_to_string_hash.put(I_enumtest,Str_enumtest);
			nml_enum_info_for_enumtest.string_to_int_hash.put(Str_enumtest,I_enumtest);
			I_enumtest= new Integer(88);
			Str_enumtest= "e";
			nml_enum_info_for_enumtest.int_to_string_hash.put(I_enumtest,Str_enumtest);
			nml_enum_info_for_enumtest.string_to_int_hash.put(Str_enumtest,I_enumtest);
			I_enumtest= new Integer(2);
			Str_enumtest= "aa";
			nml_enum_info_for_enumtest.int_to_string_hash.put(I_enumtest,Str_enumtest);
			nml_enum_info_for_enumtest.string_to_int_hash.put(Str_enumtest,I_enumtest);
			I_enumtest= new Integer(3);
			Str_enumtest= "bb";
			nml_enum_info_for_enumtest.int_to_string_hash.put(I_enumtest,Str_enumtest);
			nml_enum_info_for_enumtest.string_to_int_hash.put(Str_enumtest,I_enumtest);
			I_enumtest= new Integer(99);
			Str_enumtest= "ccc";
			nml_enum_info_for_enumtest.int_to_string_hash.put(I_enumtest,Str_enumtest);
			nml_enum_info_for_enumtest.string_to_int_hash.put(Str_enumtest,I_enumtest);
		}

		for(int i_enum_array = 0; i_enum_array < 5; i_enum_array++ )
		{
			enum_array[i_enum_array]  = 0; /* enum enumtest : a=0 */
		}
		for(int i_enumtest_dla = 0; i_enumtest_dla < 7; i_enumtest_dla++ )
		{
			enumtest_dla[i_enumtest_dla]  = 0; /* enum enumtest : a=0 */
		}
		for(int i_cart_array = 0; i_cart_array < 3; i_cart_array++ )
		{
			cart_array[i_cart_array] = new PM_CARTESIAN();
		}
		for(int i_cart_dla = 0; i_cart_dla < 5; i_cart_dla++ )
		{
			cart_dla[i_cart_dla] = new PM_CARTESIAN();
		}
		for(int i_s_array = 0; i_s_array < 3; i_s_array++ )
		{
			s_array[i_s_array]  = 0;
		}
		for(int i_i_array = 0; i_i_array < 3; i_i_array++ )
		{
			i_array[i_i_array]  = 0;
		}
		for(int i_l_array = 0; i_l_array < 3; i_l_array++ )
		{
			l_array[i_l_array]  = 0;
		}
		for(int i_us_array = 0; i_us_array < 2; i_us_array++ )
		{
			us_array[i_us_array]  = 0;
		}
		for(int i_ui_array = 0; i_ui_array < 2; i_ui_array++ )
		{
			ui_array[i_ui_array]  = 0;
		}
		for(int i_ul_array = 0; i_ul_array < 2; i_ul_array++ )
		{
			ul_array[i_ul_array]  = 0;
		}
		for(int i_teststruct_2d_array = 0; i_teststruct_2d_array < 4; i_teststruct_2d_array++ )
		{
			teststruct_2d_array[i_teststruct_2d_array] = new teststruct();
		}

	}


	public void update(NMLFormatConverter nml_fc)
	{

		nml_fc.beginClass("TEST_MESSAGE","TEST_MESSAGE_BASE");

		nml_fc.beginBaseClass("TEST_MESSAGE_BASE");

		super.update(nml_fc);

		nml_fc.endBaseClass("TEST_MESSAGE_BASE");
		byte_to_messup_msg = nml_fc.update_with_name("byte_to_messup_msg",byte_to_messup_msg);
		first_count = nml_fc.update_with_name("first_count",first_count);
		nml_fc.beginClassVar("sfoh");
		sfoh.update(nml_fc);
		nml_fc.endClassVar("sfoh");
		b = nml_fc.update_with_name("b",b);
		c = nml_fc.update_with_name("c",c);
		d = nml_fc.update_with_name("d",d);
		i = nml_fc.update_with_name("i",i);
		f = nml_fc.update_with_name("f",f);
		nml_fc.beginClassVar("fw");
		fw.update(nml_fc);
		nml_fc.endClassVar("fw");
		etd = nml_fc.update_enumeration_with_name("etd",etd,nml_enum_info_for_enumtest_typedef);
		etd2 = nml_fc.update_enumeration_with_name("etd2",etd2,nml_enum_info_for_enumtest_typedef2);
		nml_fc.update_with_name("big_array",big_array,1000);
		nml_fc.update_with_name("bool_array",bool_array,2);
		nml_fc.update_with_name("ia",ia,2);
		nml_fc.update_with_name("ca",ca,2);
		nml_fc.update_with_name("fa",fa,2);
		nml_fc.update_with_name("da",da,2);
		nml_fc.update_with_name("two_d_array",two_d_array,4);
		nml_fc.update_with_name("three_d_array",three_d_array,8);
		nml_fc.next_update_default("3.14159265");
		f_pi = nml_fc.update_with_name("f_pi",f_pi);
		cda_length = nml_fc.update_dla_length_with_name("cda_length",cda_length);
		nml_fc.update_with_name("cda",cda,cda_length);
		nml_fc.next_update_default("77.7");
		seventysevenpointseven = nml_fc.update_with_name("seventysevenpointseven",seventysevenpointseven);
		ida_length = nml_fc.update_dla_length_with_name("ida_length",ida_length);
		nml_fc.update_with_name("ida",ida,ida_length);
		nml_fc.next_update_default("88.8");
		eightyeightpointeight = nml_fc.update_with_name("eightyeightpointeight",eightyeightpointeight);
		fda_length = nml_fc.update_dla_length_with_name("fda_length",fda_length);
		nml_fc.update_with_name("fda",fda,fda_length);
		dda_length = nml_fc.update_dla_length_with_name("dda_length",dda_length);
		nml_fc.update_with_name("dda",dda,dda_length);
		nml_fc.beginClassVar("s");
		s.update(nml_fc);
		nml_fc.endClassVar("s");
		nml_fc.beginClassVar("s_td2");
		s_td2.update(nml_fc);
		nml_fc.endClassVar("s_td2");
		for(int i_sa = 0; i_sa < 2; i_sa++ )
		{
			nml_fc.beginClassArrayElem("sa",i_sa);
			sa[i_sa].update(nml_fc);

			nml_fc.endClassArrayElem("sa",i_sa);
		}
		nml_fc.next_update_default("3.14159265");
		d_pi = nml_fc.update_with_name("d_pi",d_pi);
		sda_length = nml_fc.update_dla_length_with_name("sda_length",sda_length);
		for(int i_sda = 0; i_sda < sda_length; i_sda++ )
		{
			nml_fc.beginClassArrayElem("sda",i_sda);
			sda[i_sda].update(nml_fc);

			nml_fc.endClassArrayElem("sda",i_sda);
		}
		enumtestvar = nml_fc.update_enumeration_with_name("enumtestvar",enumtestvar,nml_enum_info_for_enumtest);
		nml_fc.update_enumeration_array_with_name("enum_array",enum_array,5,nml_enum_info_for_enumtest);
		enumtest_dla_length = nml_fc.update_dla_length_with_name("enumtest_dla_length",enumtest_dla_length);
		nml_fc.update_enumeration_array_with_name("enumtest_dla",enumtest_dla,enumtest_dla_length,nml_enum_info_for_enumtest);
		nml_fc.beginClassVar("cart");
		cart.update(nml_fc);
		nml_fc.endClassVar("cart");
		for(int i_cart_array = 0; i_cart_array < 3; i_cart_array++ )
		{
			nml_fc.beginClassArrayElem("cart_array",i_cart_array);
			cart_array[i_cart_array].update(nml_fc);

			nml_fc.endClassArrayElem("cart_array",i_cart_array);
		}
		cart_dla_length = nml_fc.update_dla_length_with_name("cart_dla_length",cart_dla_length);
		for(int i_cart_dla = 0; i_cart_dla < cart_dla_length; i_cart_dla++ )
		{
			nml_fc.beginClassArrayElem("cart_dla",i_cart_dla);
			cart_dla[i_cart_dla].update(nml_fc);

			nml_fc.endClassArrayElem("cart_dla",i_cart_dla);
		}
		do_int_size_test = nml_fc.update_with_name("do_int_size_test",do_int_size_test);
		smin = nml_fc.update_with_name("smin",smin);
		smax = nml_fc.update_with_name("smax",smax);
		i_smin = nml_fc.update_with_name("i_smin",i_smin);
		i_smax = nml_fc.update_with_name("i_smax",i_smax);
		imin = nml_fc.update_with_name("imin",imin);
		imax = nml_fc.update_with_name("imax",imax);
		l_imin = nml_fc.update_with_name("l_imin",l_imin);
		l_imax = nml_fc.update_with_name("l_imax",l_imax);
		lmin = nml_fc.update_with_name("lmin",lmin);
		lmax = nml_fc.update_with_name("lmax",lmax);
		usmax = nml_fc.update_unsigned_with_name("usmax",usmax);
		ui_usmax = nml_fc.update_unsigned_with_name("ui_usmax",ui_usmax);
		uimax = nml_fc.update_unsigned_with_name("uimax",uimax);
		ul_uimax = nml_fc.update_unsigned_with_name("ul_uimax",ul_uimax);
		ulmax = nml_fc.update_unsigned_with_name("ulmax",ulmax);
		d_ulmax = nml_fc.update_with_name("d_ulmax",d_ulmax);
		d_lmin = nml_fc.update_with_name("d_lmin",d_lmin);
		d_lmax = nml_fc.update_with_name("d_lmax",d_lmax);
		nml_fc.update_with_name("s_array",s_array,3);
		nml_fc.update_with_name("i_array",i_array,3);
		nml_fc.update_with_name("l_array",l_array,3);
		nml_fc.update_unsigned_with_name("us_array",us_array,2);
		nml_fc.update_unsigned_with_name("ui_array",ui_array,2);
		nml_fc.update_unsigned_with_name("ul_array",ul_array,2);
		false_bool = nml_fc.update_with_name("false_bool",false_bool);
		true_bool = nml_fc.update_with_name("true_bool",true_bool);
		sminusone = nml_fc.update_with_name("sminusone",sminusone);
		iminusone = nml_fc.update_with_name("iminusone",iminusone);
		lminusone = nml_fc.update_with_name("lminusone",lminusone);
		fminusone = nml_fc.update_with_name("fminusone",fminusone);
		dminusone = nml_fc.update_with_name("dminusone",dminusone);
		last_count = nml_fc.update_with_name("last_count",last_count);
		for(int i_teststruct_2d_array = 0; i_teststruct_2d_array < 4; i_teststruct_2d_array++ )
		{
			nml_fc.beginClassArrayElem("teststruct_2d_array",i_teststruct_2d_array);
			teststruct_2d_array[i_teststruct_2d_array].update(nml_fc);

			nml_fc.endClassArrayElem("teststruct_2d_array",i_teststruct_2d_array);
		}
		lastvar = nml_fc.update_with_name("lastvar",lastvar);

		nml_fc.endClass("TEST_MESSAGE","TEST_MESSAGE_BASE");

	}


	public TEST_MESSAGE clone() throws CloneNotSupportedException
	{
		TEST_MESSAGE cloned_object = (TEST_MESSAGE) super.clone();
		if(this.sfoh != null) {
			cloned_object.sfoh = (struct_from_other_header ) this.sfoh.clone();
		}
		if(this.fw != null) {
			cloned_object.fw = (fwLaserStruct ) this.fw.clone();
		}
		if(this.big_array != null) {
			cloned_object.big_array = (byte []) this.big_array.clone();
		}
		if(this.bool_array != null) {
			cloned_object.bool_array = (boolean []) this.bool_array.clone();
		}
		if(this.ia != null) {
			cloned_object.ia = (int []) this.ia.clone();
		}
		if(this.ca != null) {
			cloned_object.ca = (byte []) this.ca.clone();
		}
		if(this.fa != null) {
			cloned_object.fa = (float []) this.fa.clone();
		}
		if(this.da != null) {
			cloned_object.da = (double []) this.da.clone();
		}
		if(this.two_d_array != null) {
			cloned_object.two_d_array = (double []) this.two_d_array.clone();
		}
		if(this.three_d_array != null) {
			cloned_object.three_d_array = (double []) this.three_d_array.clone();
		}
		if(this.cda != null) {
			cloned_object.cda = (byte []) this.cda.clone();
		}
		if(this.ida != null) {
			cloned_object.ida = (int []) this.ida.clone();
		}
		if(this.fda != null) {
			cloned_object.fda = (float []) this.fda.clone();
		}
		if(this.dda != null) {
			cloned_object.dda = (double []) this.dda.clone();
		}
		if(this.s != null) {
			cloned_object.s = (teststruct ) this.s.clone();
		}
		if(this.s_td2 != null) {
			cloned_object.s_td2 = (teststruct_td2 ) this.s_td2.clone();
		}
		if(this.sa != null) {
			cloned_object.sa = (teststruct []) this.sa.clone();
			for(int i_sa=0; i_sa < this.sa.length; i_sa++) {
				if(this.sa[i_sa] != null) {
					cloned_object.sa[i_sa] = (teststruct) this.sa[i_sa].clone();
				}
			}
		}
		if(this.sda != null) {
			cloned_object.sda = (teststruct []) this.sda.clone();
			for(int i_sda=0; i_sda < this.sda.length; i_sda++) {
				if(this.sda[i_sda] != null) {
					cloned_object.sda[i_sda] = (teststruct) this.sda[i_sda].clone();
				}
			}
		}
		if(this.enum_array != null) {
			cloned_object.enum_array = (int []) this.enum_array.clone();
		}
		if(this.enumtest_dla != null) {
			cloned_object.enumtest_dla = (int []) this.enumtest_dla.clone();
		}
		if(this.cart != null) {
			cloned_object.cart = (PM_CARTESIAN ) this.cart.clone();
		}
		if(this.cart_array != null) {
			cloned_object.cart_array = (PM_CARTESIAN []) this.cart_array.clone();
			for(int i_cart_array=0; i_cart_array < this.cart_array.length; i_cart_array++) {
				if(this.cart_array[i_cart_array] != null) {
					cloned_object.cart_array[i_cart_array] = (PM_CARTESIAN) this.cart_array[i_cart_array].clone();
				}
			}
		}
		if(this.cart_dla != null) {
			cloned_object.cart_dla = (PM_CARTESIAN []) this.cart_dla.clone();
			for(int i_cart_dla=0; i_cart_dla < this.cart_dla.length; i_cart_dla++) {
				if(this.cart_dla[i_cart_dla] != null) {
					cloned_object.cart_dla[i_cart_dla] = (PM_CARTESIAN) this.cart_dla[i_cart_dla].clone();
				}
			}
		}
		if(this.s_array != null) {
			cloned_object.s_array = (short []) this.s_array.clone();
		}
		if(this.i_array != null) {
			cloned_object.i_array = (int []) this.i_array.clone();
		}
		if(this.l_array != null) {
			cloned_object.l_array = (long []) this.l_array.clone();
		}
		if(this.us_array != null) {
			cloned_object.us_array = (short []) this.us_array.clone();
		}
		if(this.ui_array != null) {
			cloned_object.ui_array = (int []) this.ui_array.clone();
		}
		if(this.ul_array != null) {
			cloned_object.ul_array = (long []) this.ul_array.clone();
		}
		if(this.teststruct_2d_array != null) {
			cloned_object.teststruct_2d_array = (teststruct []) this.teststruct_2d_array.clone();
			for(int i_teststruct_2d_array=0; i_teststruct_2d_array < this.teststruct_2d_array.length; i_teststruct_2d_array++) {
				if(this.teststruct_2d_array[i_teststruct_2d_array] != null) {
					cloned_object.teststruct_2d_array[i_teststruct_2d_array] = (teststruct) this.teststruct_2d_array[i_teststruct_2d_array].clone();
				}
			}
		}
		return cloned_object;

	}
}

