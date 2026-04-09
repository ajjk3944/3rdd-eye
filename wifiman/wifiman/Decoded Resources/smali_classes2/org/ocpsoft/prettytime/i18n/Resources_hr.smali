.class public Lorg/ocpsoft/prettytime/i18n/Resources_hr;
.super Ljava/util/ListResourceBundle;
.source "SourceFile"

# interfaces
.implements LCj/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;,
        Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormat;,
        Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrName;
    }
.end annotation


# static fields
.field private static final a:[[Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 97

    const-string v0, "CenturyPattern"

    const-string v1, "%n %u"

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v2

    const-string v0, "CenturyFuturePrefix"

    const-string v15, "za "

    filled-new-array {v0, v15}, [Ljava/lang/Object;

    move-result-object v3

    const-string v0, "CenturyFutureSuffix"

    const-string v14, ""

    filled-new-array {v0, v14}, [Ljava/lang/Object;

    move-result-object v4

    const-string v0, "CenturyPastPrefix"

    filled-new-array {v0, v14}, [Ljava/lang/Object;

    move-result-object v5

    const-string v0, "CenturyPastSuffix"

    const-string v6, " unatrag"

    filled-new-array {v0, v6}, [Ljava/lang/Object;

    move-result-object v6

    const-string v0, "CenturySingularName"

    const-string v7, "stolje\u0107e"

    filled-new-array {v0, v7}, [Ljava/lang/Object;

    move-result-object v7

    const-string v0, "CenturyPluralName"

    const-string v8, "stolje\u0107a"

    filled-new-array {v0, v8}, [Ljava/lang/Object;

    move-result-object v8

    const-string v0, "DayPattern"

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v9

    const-string v0, "DayFuturePrefix"

    filled-new-array {v0, v15}, [Ljava/lang/Object;

    move-result-object v10

    const-string v0, "DayFutureSuffix"

    filled-new-array {v0, v14}, [Ljava/lang/Object;

    move-result-object v11

    const-string v0, "DayPastPrefix"

    const-string v13, "prije "

    filled-new-array {v0, v13}, [Ljava/lang/Object;

    move-result-object v12

    const-string v0, "DayPastSuffix"

    filled-new-array {v0, v14}, [Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v93, v2

    move-object v2, v13

    move-object v13, v0

    const-string v0, "DaySingularName"

    move-object/from16 v16, v14

    const-string v14, "dan"

    filled-new-array {v0, v14}, [Ljava/lang/Object;

    move-result-object v14

    move-object/from16 v0, v16

    move-object/from16 v16, v15

    const-string v15, "DayPluralName"

    move-object/from16 v94, v3

    const-string v3, "dana"

    filled-new-array {v15, v3}, [Ljava/lang/Object;

    move-result-object v15

    move-object/from16 v3, v16

    move-object/from16 v95, v4

    const-string v4, "DecadePattern"

    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v16

    const-string v4, "DecadeFuturePrefix"

    filled-new-array {v4, v3}, [Ljava/lang/Object;

    move-result-object v17

    const-string v4, "DecadeFutureSuffix"

    filled-new-array {v4, v0}, [Ljava/lang/Object;

    move-result-object v18

    const-string v4, "DecadePastPrefix"

    filled-new-array {v4, v2}, [Ljava/lang/Object;

    move-result-object v19

    const-string v4, "DecadePastSuffix"

    filled-new-array {v4, v0}, [Ljava/lang/Object;

    move-result-object v20

    const-string v4, "DecadeSingularName"

    move-object/from16 v96, v5

    const-string v5, "desetlje\u0107e"

    filled-new-array {v4, v5}, [Ljava/lang/Object;

    move-result-object v21

    const-string v4, "DecadePluralName"

    const-string v5, "desetlje\u0107a"

    filled-new-array {v4, v5}, [Ljava/lang/Object;

    move-result-object v22

    const-string v4, "HourPattern"

    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v23

    const-string v4, "HourFuturePrefix"

    filled-new-array {v4, v3}, [Ljava/lang/Object;

    move-result-object v24

    const-string v4, "HourFutureSuffix"

    filled-new-array {v4, v0}, [Ljava/lang/Object;

    move-result-object v25

    const-string v4, "HourPastPrefix"

    filled-new-array {v4, v2}, [Ljava/lang/Object;

    move-result-object v26

    const-string v4, "HourPastSuffix"

    filled-new-array {v4, v0}, [Ljava/lang/Object;

    move-result-object v27

    const-string v4, "HourSingularName"

    const-string v5, "sat"

    filled-new-array {v4, v5}, [Ljava/lang/Object;

    move-result-object v28

    const-string v4, "HourPluralName"

    const-string v5, "sati"

    filled-new-array {v4, v5}, [Ljava/lang/Object;

    move-result-object v29

    const-string v4, "JustNowPattern"

    const-string v5, "%u"

    filled-new-array {v4, v5}, [Ljava/lang/Object;

    move-result-object v30

    const-string v4, "JustNowFuturePrefix"

    const-string v5, "za nekoliko trenutaka"

    filled-new-array {v4, v5}, [Ljava/lang/Object;

    move-result-object v31

    const-string v4, "JustNowFutureSuffix"

    filled-new-array {v4, v0}, [Ljava/lang/Object;

    move-result-object v32

    const-string v4, "JustNowPastPrefix"

    const-string v5, "prije nekoliko trenutaka"

    filled-new-array {v4, v5}, [Ljava/lang/Object;

    move-result-object v33

    const-string v4, "JustNowPastSuffix"

    filled-new-array {v4, v0}, [Ljava/lang/Object;

    move-result-object v34

    const-string v4, "JustNowSingularName"

    filled-new-array {v4, v0}, [Ljava/lang/Object;

    move-result-object v35

    const-string v4, "JustNowPluralName"

    filled-new-array {v4, v0}, [Ljava/lang/Object;

    move-result-object v36

    const-string v4, "MillenniumPattern"

    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v37

    const-string v4, "MillenniumFuturePrefix"

    filled-new-array {v4, v3}, [Ljava/lang/Object;

    move-result-object v38

    const-string v4, "MillenniumFutureSuffix"

    filled-new-array {v4, v0}, [Ljava/lang/Object;

    move-result-object v39

    const-string v4, "MillenniumPastPrefix"

    filled-new-array {v4, v2}, [Ljava/lang/Object;

    move-result-object v40

    const-string v4, "MillenniumPastSuffix"

    filled-new-array {v4, v0}, [Ljava/lang/Object;

    move-result-object v41

    const-string v4, "MillenniumSingularName"

    const-string v5, "tisu\u0107lje\u0107e"

    filled-new-array {v4, v5}, [Ljava/lang/Object;

    move-result-object v42

    const-string v4, "MillenniumPluralName"

    const-string v5, "tisu\u0107lje\u0107a"

    filled-new-array {v4, v5}, [Ljava/lang/Object;

    move-result-object v43

    const-string v4, "MillisecondPattern"

    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v44

    const-string v4, "MillisecondFuturePrefix"

    filled-new-array {v4, v3}, [Ljava/lang/Object;

    move-result-object v45

    const-string v4, "MillisecondFutureSuffix"

    filled-new-array {v4, v0}, [Ljava/lang/Object;

    move-result-object v46

    const-string v4, "MillisecondPastPrefix"

    filled-new-array {v4, v2}, [Ljava/lang/Object;

    move-result-object v47

    const-string v4, "MillisecondPastSuffix"

    filled-new-array {v4, v0}, [Ljava/lang/Object;

    move-result-object v48

    const-string v4, "MillisecondSingularName"

    const-string v5, "milisekunda"

    filled-new-array {v4, v5}, [Ljava/lang/Object;

    move-result-object v49

    const-string v4, "MillisecondPluralName"

    filled-new-array {v4, v5}, [Ljava/lang/Object;

    move-result-object v50

    const-string v4, "MinutePattern"

    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v51

    const-string v4, "MinuteFuturePrefix"

    filled-new-array {v4, v3}, [Ljava/lang/Object;

    move-result-object v52

    const-string v4, "MinuteFutureSuffix"

    filled-new-array {v4, v0}, [Ljava/lang/Object;

    move-result-object v53

    const-string v4, "MinutePastPrefix"

    filled-new-array {v4, v2}, [Ljava/lang/Object;

    move-result-object v54

    const-string v4, "MinutePastSuffix"

    filled-new-array {v4, v0}, [Ljava/lang/Object;

    move-result-object v55

    const-string v4, "MinuteSingularName"

    const-string v5, "minuta"

    filled-new-array {v4, v5}, [Ljava/lang/Object;

    move-result-object v56

    const-string v4, "MinutePluralName"

    filled-new-array {v4, v5}, [Ljava/lang/Object;

    move-result-object v57

    const-string v4, "MonthPattern"

    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v58

    const-string v4, "MonthFuturePrefix"

    filled-new-array {v4, v3}, [Ljava/lang/Object;

    move-result-object v59

    const-string v4, "MonthFutureSuffix"

    filled-new-array {v4, v0}, [Ljava/lang/Object;

    move-result-object v60

    const-string v4, "MonthPastPrefix"

    filled-new-array {v4, v2}, [Ljava/lang/Object;

    move-result-object v61

    const-string v4, "MonthPastSuffix"

    filled-new-array {v4, v0}, [Ljava/lang/Object;

    move-result-object v62

    const-string v4, "MonthSingularName"

    const-string v5, "mjesec"

    filled-new-array {v4, v5}, [Ljava/lang/Object;

    move-result-object v63

    const-string v4, "MonthPluralName"

    const-string v5, "mjeseca"

    filled-new-array {v4, v5}, [Ljava/lang/Object;

    move-result-object v64

    const-string v4, "SecondPattern"

    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v65

    const-string v4, "SecondFuturePrefix"

    filled-new-array {v4, v3}, [Ljava/lang/Object;

    move-result-object v66

    const-string v4, "SecondFutureSuffix"

    filled-new-array {v4, v0}, [Ljava/lang/Object;

    move-result-object v67

    const-string v4, "SecondPastPrefix"

    filled-new-array {v4, v2}, [Ljava/lang/Object;

    move-result-object v68

    const-string v4, "SecondPastSuffix"

    filled-new-array {v4, v0}, [Ljava/lang/Object;

    move-result-object v69

    const-string v4, "SecondSingularName"

    const-string v5, "sekunda"

    filled-new-array {v4, v5}, [Ljava/lang/Object;

    move-result-object v70

    const-string v4, "SecondPluralName"

    const-string v5, "sekundi"

    filled-new-array {v4, v5}, [Ljava/lang/Object;

    move-result-object v71

    const-string v4, "WeekPattern"

    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v72

    const-string v4, "WeekFuturePrefix"

    filled-new-array {v4, v3}, [Ljava/lang/Object;

    move-result-object v73

    const-string v4, "WeekFutureSuffix"

    filled-new-array {v4, v0}, [Ljava/lang/Object;

    move-result-object v74

    const-string v4, "WeekPastPrefix"

    filled-new-array {v4, v2}, [Ljava/lang/Object;

    move-result-object v75

    const-string v4, "WeekPastSuffix"

    filled-new-array {v4, v0}, [Ljava/lang/Object;

    move-result-object v76

    const-string v4, "WeekSingularName"

    const-string v5, "tjedan"

    filled-new-array {v4, v5}, [Ljava/lang/Object;

    move-result-object v77

    const-string v4, "WeekPluralName"

    const-string v5, "tjedna"

    filled-new-array {v4, v5}, [Ljava/lang/Object;

    move-result-object v78

    const-string v4, "YearPattern"

    filled-new-array {v4, v1}, [Ljava/lang/Object;

    move-result-object v79

    const-string v1, "YearFuturePrefix"

    filled-new-array {v1, v3}, [Ljava/lang/Object;

    move-result-object v80

    const-string v1, "YearFutureSuffix"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v81

    const-string v1, "YearPastPrefix"

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v82

    const-string v1, "YearPastSuffix"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v83

    const-string v1, "YearSingularName"

    const-string v2, "godina"

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v84

    const-string v1, "YearPluralName"

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v85

    const-string v1, "AbstractTimeUnitPattern"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v86

    const-string v1, "AbstractTimeUnitFuturePrefix"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v87

    const-string v1, "AbstractTimeUnitFutureSuffix"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v88

    const-string v1, "AbstractTimeUnitPastPrefix"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v89

    const-string v1, "AbstractTimeUnitPastSuffix"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v90

    const-string v1, "AbstractTimeUnitSingularName"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v91

    const-string v1, "AbstractTimeUnitPluralName"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v92

    move-object/from16 v2, v93

    move-object/from16 v3, v94

    move-object/from16 v4, v95

    move-object/from16 v5, v96

    filled-new-array/range {v2 .. v92}, [[Ljava/lang/Object;

    move-result-object v0

    sput-object v0, Lorg/ocpsoft/prettytime/i18n/Resources_hr;->a:[[Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/util/ListResourceBundle;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LAj/g;)LAj/f;
    .locals 7

    instance-of v0, p1, Lorg/ocpsoft/prettytime/units/Minute;

    const-wide/16 v1, 0x4

    const-wide v3, 0x7fffffffffffffffL

    const-wide/16 v5, 0x1

    if-eqz v0, :cond_0

    new-instance p1, Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;

    const-string v0, "Minute"

    invoke-direct {p1, v0}, Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;-><init>(Ljava/lang/String;)V

    const-string v0, "minutu"

    invoke-virtual {p1, v0, v5, v6}, Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;->b(Ljava/lang/String;J)Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;

    move-result-object p1

    const-string v0, "minute"

    invoke-virtual {p1, v0, v1, v2}, Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;->b(Ljava/lang/String;J)Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;

    move-result-object p1

    const-string v0, "minuta"

    invoke-virtual {p1, v0, v3, v4}, Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;->b(Ljava/lang/String;J)Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;

    move-result-object p1

    invoke-virtual {p1, p0}, Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;->c(Ljava/util/ResourceBundle;)Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormat;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Lorg/ocpsoft/prettytime/units/Hour;

    if-eqz v0, :cond_1

    new-instance p1, Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;

    const-string v0, "Hour"

    invoke-direct {p1, v0}, Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;-><init>(Ljava/lang/String;)V

    const-string v0, "sat"

    invoke-virtual {p1, v0, v5, v6}, Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;->b(Ljava/lang/String;J)Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;

    move-result-object p1

    const-string v0, "sata"

    invoke-virtual {p1, v0, v1, v2}, Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;->b(Ljava/lang/String;J)Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;

    move-result-object p1

    const-string v0, "sati"

    invoke-virtual {p1, v0, v3, v4}, Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;->b(Ljava/lang/String;J)Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;

    move-result-object p1

    invoke-virtual {p1, p0}, Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;->c(Ljava/util/ResourceBundle;)Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormat;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v0, p1, Lorg/ocpsoft/prettytime/units/Day;

    if-eqz v0, :cond_2

    new-instance p1, Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;

    const-string v0, "Day"

    invoke-direct {p1, v0}, Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;-><init>(Ljava/lang/String;)V

    const-string v0, "dan"

    invoke-virtual {p1, v0, v5, v6}, Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;->b(Ljava/lang/String;J)Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;

    move-result-object p1

    const-string v0, "dana"

    invoke-virtual {p1, v0, v1, v2}, Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;->b(Ljava/lang/String;J)Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;

    move-result-object p1

    invoke-virtual {p1, v0, v3, v4}, Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;->b(Ljava/lang/String;J)Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;

    move-result-object p1

    invoke-virtual {p1, p0}, Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;->c(Ljava/util/ResourceBundle;)Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormat;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of v0, p1, Lorg/ocpsoft/prettytime/units/Week;

    if-eqz v0, :cond_3

    new-instance p1, Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;

    const-string v0, "Week"

    invoke-direct {p1, v0}, Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;-><init>(Ljava/lang/String;)V

    const-string v0, "tjedan"

    invoke-virtual {p1, v0, v5, v6}, Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;->b(Ljava/lang/String;J)Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;

    move-result-object p1

    const-string v0, "tjedna"

    invoke-virtual {p1, v0, v1, v2}, Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;->b(Ljava/lang/String;J)Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;

    move-result-object p1

    const-string v0, "tjedana"

    invoke-virtual {p1, v0, v3, v4}, Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;->b(Ljava/lang/String;J)Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;

    move-result-object p1

    invoke-virtual {p1, p0}, Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;->c(Ljava/util/ResourceBundle;)Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormat;

    move-result-object p1

    return-object p1

    :cond_3
    instance-of v0, p1, Lorg/ocpsoft/prettytime/units/Month;

    if-eqz v0, :cond_4

    new-instance p1, Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;

    const-string v0, "Month"

    invoke-direct {p1, v0}, Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;-><init>(Ljava/lang/String;)V

    const-string v0, "mjesec"

    invoke-virtual {p1, v0, v5, v6}, Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;->b(Ljava/lang/String;J)Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;

    move-result-object p1

    const-string v0, "mjeseca"

    invoke-virtual {p1, v0, v1, v2}, Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;->b(Ljava/lang/String;J)Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;

    move-result-object p1

    const-string v0, "mjeseci"

    invoke-virtual {p1, v0, v3, v4}, Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;->b(Ljava/lang/String;J)Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;

    move-result-object p1

    invoke-virtual {p1, p0}, Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;->c(Ljava/util/ResourceBundle;)Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormat;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of v0, p1, Lorg/ocpsoft/prettytime/units/Year;

    if-eqz v0, :cond_5

    new-instance p1, Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;

    const-string v0, "Year"

    invoke-direct {p1, v0}, Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;-><init>(Ljava/lang/String;)V

    const-string v0, "godinu"

    invoke-virtual {p1, v0, v5, v6}, Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;->b(Ljava/lang/String;J)Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;

    move-result-object p1

    const-string v0, "godine"

    invoke-virtual {p1, v0, v1, v2}, Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;->b(Ljava/lang/String;J)Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;

    move-result-object p1

    const-string v0, "godina"

    invoke-virtual {p1, v0, v3, v4}, Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;->b(Ljava/lang/String;J)Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;

    move-result-object p1

    invoke-virtual {p1, p0}, Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;->c(Ljava/util/ResourceBundle;)Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormat;

    move-result-object p1

    return-object p1

    :cond_5
    instance-of p1, p1, Lorg/ocpsoft/prettytime/units/Millennium;

    if-eqz p1, :cond_6

    new-instance p1, Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;

    const-string v0, "Millennium"

    invoke-direct {p1, v0}, Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;-><init>(Ljava/lang/String;)V

    const-string v0, "tisu\u0107lje\u0107e"

    invoke-virtual {p1, v0, v5, v6}, Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;->b(Ljava/lang/String;J)Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;

    move-result-object p1

    const-string v0, "tisu\u0107lje\u0107a"

    invoke-virtual {p1, v0, v3, v4}, Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;->b(Ljava/lang/String;J)Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;

    move-result-object p1

    invoke-virtual {p1, p0}, Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormatBuilder;->c(Ljava/util/ResourceBundle;)Lorg/ocpsoft/prettytime/i18n/Resources_hr$HrTimeFormat;

    move-result-object p1

    return-object p1

    :cond_6
    const/4 p1, 0x0

    return-object p1
.end method

.method public getContents()[[Ljava/lang/Object;
    .locals 1

    sget-object v0, Lorg/ocpsoft/prettytime/i18n/Resources_hr;->a:[[Ljava/lang/Object;

    return-object v0
.end method
