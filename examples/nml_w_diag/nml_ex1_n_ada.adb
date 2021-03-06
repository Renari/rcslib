--
--	New Ada Body File starts here.
--	This file should be named nml_ex1_n_ada.adb
--	Automatically generated by NML CodeGen Java Applet.


with Nml_Msg; use Nml_Msg;

with Posemath_N_Ada;  use Posemath_N_Ada;

with Cms;


--	Some standard Ada Packages we always need.
with Unchecked_Deallocation;
with Unchecked_Conversion;
with Interfaces.C; use Interfaces.C;
with Interfaces.C.Strings; use Interfaces.C.Strings;

package body nml_ex1_n_ada is

	-- Create some common variables  and functions needed for updating Enumeration types.

	-- Every NMLmsg type needs an update and an initialize function.

	procedure Initialize(Msg : in out EXAMPLE_MSG) is
	begin
		Msg.NmlType := EXAMPLE_MSG_TYPE;
		Msg.Size := EXAMPLE_MSG'Size/8;
	end Initialize;

	procedure Update_EXAMPLE_MSG(Cms_Ptr : in Cms.Cms_Access; Msg : in EXAMPLE_MSG_Access) is
	begin
		Cms.Begin_Class(Cms_Ptr,"EXAMPLE_MSG","");
		Msg.NmlType := EXAMPLE_MSG_TYPE;
		Msg.Size := EXAMPLE_MSG'Size/8;
		Cms.Update_Double(Cms_Ptr, "d", Msg.d);
		Cms.Update_C_Float(Cms_Ptr, "f", Msg.f);
		Cms.Update_Char(Cms_Ptr, "c", Msg.c);
		Cms.Update_Short(Cms_Ptr, "s", Msg.s);
		Cms.Update_Int(Cms_Ptr, "i", Msg.i);
		Cms.Update_Long(Cms_Ptr, "l", Msg.l);
		Cms.Update_Unsigned_Char(Cms_Ptr, "uc", Msg.uc);
		Cms.Update_Unsigned_Short(Cms_Ptr, "us", Msg.us);
		Cms.Update_Unsigned(Cms_Ptr, "ui", Msg.ui);
		Cms.Update_Unsigned_Long(Cms_Ptr, "ul", Msg.ul);
		Cms.Update_Dla_Length(Cms_Ptr,"da_length", Msg.da_Length);
		Cms.Update_Double_Dla(Cms_Ptr, "da", Msg.da,Msg.da_length,20);
		Cms.End_Class(Cms_Ptr,"EXAMPLE_MSG","");
	end Update_EXAMPLE_MSG;

	procedure Update_Internal_EXAMPLE_MSG(Cms_Ptr : in Cms.Cms_Access; Msg : in out EXAMPLE_MSG) is
	begin
		Cms.Begin_Class(Cms_Ptr,"EXAMPLE_MSG","");
		Msg.NmlType := EXAMPLE_MSG_TYPE;
		Msg.Size := EXAMPLE_MSG'Size/8;
		Cms.Update_Double(Cms_Ptr, "d", Msg.d);
		Cms.Update_C_Float(Cms_Ptr, "f", Msg.f);
		Cms.Update_Char(Cms_Ptr, "c", Msg.c);
		Cms.Update_Short(Cms_Ptr, "s", Msg.s);
		Cms.Update_Int(Cms_Ptr, "i", Msg.i);
		Cms.Update_Long(Cms_Ptr, "l", Msg.l);
		Cms.Update_Unsigned_Char(Cms_Ptr, "uc", Msg.uc);
		Cms.Update_Unsigned_Short(Cms_Ptr, "us", Msg.us);
		Cms.Update_Unsigned(Cms_Ptr, "ui", Msg.ui);
		Cms.Update_Unsigned_Long(Cms_Ptr, "ul", Msg.ul);
		Cms.Update_Dla_Length(Cms_Ptr,"da_length", Msg.da_Length);
		Cms.Update_Double_Dla(Cms_Ptr, "da", Msg.da,Msg.da_length,20);
		Cms.End_Class(Cms_Ptr,"EXAMPLE_MSG","");
	end Update_Internal_EXAMPLE_MSG;



	NameList : constant Char_Array(1..24) := (
		'E','X','A','M','P','L','E','_','M','S','G',nul,
		nul,nul,nul,nul,nul,nul,nul,nul,nul,nul,nul,nul
		);

	IdList : constant Cms.Long_Array(1..2) := (
		EXAMPLE_MSG_TYPE, -- 101, 0
		-1);

	SizeList : constant Cms.Size_T_Array(1..2) := (
		EXAMPLE_MSG'Size/8,
		0);
	Symbol_Lookup_EXAMPLE_MSG_Name : constant Interfaces.C.Strings.Chars_Ptr := Interfaces.C.Strings.New_String("EXAMPLE_MSG");

	function Symbol_Lookup(Nml_Type : in long) return Interfaces.C.Strings.Chars_Ptr;
	pragma Export(C,Symbol_Lookup,"ada_nml_ex1_n_ada_symbol_lookup");

	function Symbol_Lookup(Nml_Type : in long) return Interfaces.C.Strings.Chars_Ptr is
	begin
		case Nml_Type is
			 when EXAMPLE_MSG_TYPE	=>	return Symbol_Lookup_EXAMPLE_MSG_Name;
			 when others	=>	return Null_Ptr;
		end case;
	end Symbol_Lookup;

	function Format(Nml_Type : in long;
			Msg : in NmlMsg_Access;
			Cms_Ptr : in Cms.Cms_Access)
				return int is
		Checked_Nml_Type : long;

	begin
		Checked_Nml_Type := Cms.Check_Type_Info(Cms_Ptr,Nml_Type,
			NmlMsg_Access_To_Limited_Controlled_Access(Msg),
			"nml_ex1_n_ada",
			Symbol_Lookup'Access,
			NameList,IdList,SizeList,2,12);

		if Msg = Null then
			return 0;
		end if;

		case Checked_Nml_Type is
			when EXAMPLE_MSG_TYPE	=>	Update_EXAMPLE_MSG(Cms_Ptr, NmlMsg_to_EXAMPLE_MSG(Msg));
			when others	=>	return 0;
		end case;
		return 1;
	end Format;

end nml_ex1_n_ada;

-- End of Ada Body file  nml_ex1_n_ada.adb

