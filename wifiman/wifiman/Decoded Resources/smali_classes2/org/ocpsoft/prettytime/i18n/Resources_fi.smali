.class public Lorg/ocpsoft/prettytime/i18n/Resources_fi;
.super Ljava/util/ListResourceBundle;
.source "SourceFile"

# interfaces
.implements LCj/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;
    }
.end annotation


# static fields
.field private static b:[[Ljava/lang/Object;


# instance fields
.field private final a:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 90

    const-string v0, "JustNowPattern"

    const-string v1, "%u"

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v2

    const-string v0, "JustNowPastSingularName"

    const-string v3, "hetki"

    filled-new-array {v0, v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v0, "JustNowFutureSingularName"

    const-string v4, "hetken"

    filled-new-array {v0, v4}, [Ljava/lang/Object;

    move-result-object v4

    const-string v0, "JustNowPastSuffix"

    const-string v15, "sitten"

    filled-new-array {v0, v15}, [Ljava/lang/Object;

    move-result-object v5

    const-string v0, "JustNowFutureSuffix"

    const-string v14, "p\u00e4\u00e4st\u00e4"

    filled-new-array {v0, v14}, [Ljava/lang/Object;

    move-result-object v6

    const-string v0, "MillisecondPattern"

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v7

    const-string v0, "MillisecondPluralPattern"

    const-string v13, "%n %u"

    filled-new-array {v0, v13}, [Ljava/lang/Object;

    move-result-object v8

    const-string v0, "MillisecondPastSingularName"

    const-string v9, "millisekunti"

    filled-new-array {v0, v9}, [Ljava/lang/Object;

    move-result-object v9

    const-string v0, "MillisecondPastPluralName"

    const-string v10, "millisekuntia"

    filled-new-array {v0, v10}, [Ljava/lang/Object;

    move-result-object v10

    const-string v0, "MillisecondFutureSingularName"

    const-string v11, "millisekunnin"

    filled-new-array {v0, v11}, [Ljava/lang/Object;

    move-result-object v11

    const-string v0, "MillisecondPastSuffix"

    filled-new-array {v0, v15}, [Ljava/lang/Object;

    move-result-object v12

    const-string v0, "MillisecondFutureSuffix"

    filled-new-array {v0, v14}, [Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v86, v2

    move-object v2, v13

    move-object v13, v0

    const-string v0, "SecondPattern"

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v87, v3

    move-object v3, v14

    move-object v14, v0

    const-string v0, "SecondPluralPattern"

    filled-new-array {v0, v2}, [Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v88, v4

    move-object v4, v15

    move-object v15, v0

    const-string v0, "SecondPastSingularName"

    move-object/from16 v89, v5

    const-string v5, "sekunti"

    filled-new-array {v0, v5}, [Ljava/lang/Object;

    move-result-object v16

    const-string v0, "SecondPastPluralName"

    const-string v5, "sekuntia"

    filled-new-array {v0, v5}, [Ljava/lang/Object;

    move-result-object v17

    const-string v0, "SecondFutureSingularName"

    const-string v5, "sekunnin"

    filled-new-array {v0, v5}, [Ljava/lang/Object;

    move-result-object v18

    const-string v0, "SecondPastSuffix"

    filled-new-array {v0, v4}, [Ljava/lang/Object;

    move-result-object v19

    const-string v0, "SecondFutureSuffix"

    filled-new-array {v0, v3}, [Ljava/lang/Object;

    move-result-object v20

    const-string v0, "MinutePattern"

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v21

    const-string v0, "MinutePluralPattern"

    filled-new-array {v0, v2}, [Ljava/lang/Object;

    move-result-object v22

    const-string v0, "MinutePastSingularName"

    const-string v5, "minuutti"

    filled-new-array {v0, v5}, [Ljava/lang/Object;

    move-result-object v23

    const-string v0, "MinutePastPluralName"

    const-string v5, "minuuttia"

    filled-new-array {v0, v5}, [Ljava/lang/Object;

    move-result-object v24

    const-string v0, "MinuteFutureSingularName"

    const-string v5, "minuutin"

    filled-new-array {v0, v5}, [Ljava/lang/Object;

    move-result-object v25

    const-string v0, "MinutePastSuffix"

    filled-new-array {v0, v4}, [Ljava/lang/Object;

    move-result-object v26

    const-string v0, "MinuteFutureSuffix"

    filled-new-array {v0, v3}, [Ljava/lang/Object;

    move-result-object v27

    const-string v0, "HourPattern"

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v28

    const-string v0, "HourPluralPattern"

    filled-new-array {v0, v2}, [Ljava/lang/Object;

    move-result-object v29

    const-string v0, "HourPastSingularName"

    const-string v5, "tunti"

    filled-new-array {v0, v5}, [Ljava/lang/Object;

    move-result-object v30

    const-string v0, "HourPastPluralName"

    const-string v5, "tuntia"

    filled-new-array {v0, v5}, [Ljava/lang/Object;

    move-result-object v31

    const-string v0, "HourFutureSingularName"

    const-string v5, "tunnin"

    filled-new-array {v0, v5}, [Ljava/lang/Object;

    move-result-object v32

    const-string v0, "HourPastSuffix"

    filled-new-array {v0, v4}, [Ljava/lang/Object;

    move-result-object v33

    const-string v0, "HourFutureSuffix"

    filled-new-array {v0, v3}, [Ljava/lang/Object;

    move-result-object v34

    const-string v0, "DayPattern"

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v35

    const-string v0, "DayPluralPattern"

    filled-new-array {v0, v2}, [Ljava/lang/Object;

    move-result-object v36

    const-string v0, "DayPastSingularName"

    const-string v5, "eilen"

    filled-new-array {v0, v5}, [Ljava/lang/Object;

    move-result-object v37

    const-string v0, "DayPastPluralName"

    const-string v5, "p\u00e4iv\u00e4\u00e4"

    filled-new-array {v0, v5}, [Ljava/lang/Object;

    move-result-object v38

    const-string v0, "DayFutureSingularName"

    const-string v5, "huomenna"

    filled-new-array {v0, v5}, [Ljava/lang/Object;

    move-result-object v39

    const-string v0, "DayFuturePluralName"

    const-string v5, "p\u00e4iv\u00e4n"

    filled-new-array {v0, v5}, [Ljava/lang/Object;

    move-result-object v40

    const-string v0, "DayPastSuffix"

    filled-new-array {v0, v4}, [Ljava/lang/Object;

    move-result-object v41

    const-string v0, "DayFutureSuffix"

    filled-new-array {v0, v3}, [Ljava/lang/Object;

    move-result-object v42

    const-string v0, "WeekPattern"

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v43

    const-string v0, "WeekPluralPattern"

    filled-new-array {v0, v2}, [Ljava/lang/Object;

    move-result-object v44

    const-string v0, "WeekPastSingularName"

    const-string v5, "viikko"

    filled-new-array {v0, v5}, [Ljava/lang/Object;

    move-result-object v45

    const-string v0, "WeekPastPluralName"

    const-string v5, "viikkoa"

    filled-new-array {v0, v5}, [Ljava/lang/Object;

    move-result-object v46

    const-string v0, "WeekFutureSingularName"

    const-string v5, "viikon"

    filled-new-array {v0, v5}, [Ljava/lang/Object;

    move-result-object v47

    const-string v0, "WeekFuturePluralName"

    filled-new-array {v0, v5}, [Ljava/lang/Object;

    move-result-object v48

    const-string v0, "WeekPastSuffix"

    filled-new-array {v0, v4}, [Ljava/lang/Object;

    move-result-object v49

    const-string v0, "WeekFutureSuffix"

    filled-new-array {v0, v3}, [Ljava/lang/Object;

    move-result-object v50

    const-string v0, "MonthPattern"

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v51

    const-string v0, "MonthPluralPattern"

    filled-new-array {v0, v2}, [Ljava/lang/Object;

    move-result-object v52

    const-string v0, "MonthPastSingularName"

    const-string v5, "kuukausi"

    filled-new-array {v0, v5}, [Ljava/lang/Object;

    move-result-object v53

    const-string v0, "MonthPastPluralName"

    const-string v5, "kuukautta"

    filled-new-array {v0, v5}, [Ljava/lang/Object;

    move-result-object v54

    const-string v0, "MonthFutureSingularName"

    const-string v5, "kuukauden"

    filled-new-array {v0, v5}, [Ljava/lang/Object;

    move-result-object v55

    const-string v0, "MonthPastSuffix"

    filled-new-array {v0, v4}, [Ljava/lang/Object;

    move-result-object v56

    const-string v0, "MonthFutureSuffix"

    filled-new-array {v0, v3}, [Ljava/lang/Object;

    move-result-object v57

    const-string v0, "YearPattern"

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v58

    const-string v0, "YearPluralPattern"

    filled-new-array {v0, v2}, [Ljava/lang/Object;

    move-result-object v59

    const-string v0, "YearPastSingularName"

    const-string v5, "vuosi"

    filled-new-array {v0, v5}, [Ljava/lang/Object;

    move-result-object v60

    const-string v0, "YearPastPluralName"

    const-string v5, "vuotta"

    filled-new-array {v0, v5}, [Ljava/lang/Object;

    move-result-object v61

    const-string v0, "YearFutureSingularName"

    const-string v5, "vuoden"

    filled-new-array {v0, v5}, [Ljava/lang/Object;

    move-result-object v62

    const-string v0, "YearPastSuffix"

    filled-new-array {v0, v4}, [Ljava/lang/Object;

    move-result-object v63

    const-string v0, "YearFutureSuffix"

    filled-new-array {v0, v3}, [Ljava/lang/Object;

    move-result-object v64

    const-string v0, "DecadePattern"

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v65

    const-string v0, "DecadePluralPattern"

    filled-new-array {v0, v2}, [Ljava/lang/Object;

    move-result-object v66

    const-string v0, "DecadePastSingularName"

    const-string v5, "vuosikymmen"

    filled-new-array {v0, v5}, [Ljava/lang/Object;

    move-result-object v67

    const-string v0, "DecadePastPluralName"

    const-string v5, "vuosikymment\u00e4"

    filled-new-array {v0, v5}, [Ljava/lang/Object;

    move-result-object v68

    const-string v0, "DecadeFutureSingularName"

    const-string v5, "vuosikymmenen"

    filled-new-array {v0, v5}, [Ljava/lang/Object;

    move-result-object v69

    const-string v0, "DecadePastSuffix"

    filled-new-array {v0, v4}, [Ljava/lang/Object;

    move-result-object v70

    const-string v0, "DecadeFutureSuffix"

    filled-new-array {v0, v3}, [Ljava/lang/Object;

    move-result-object v71

    const-string v0, "CenturyPattern"

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v72

    const-string v0, "CenturyPluralPattern"

    filled-new-array {v0, v2}, [Ljava/lang/Object;

    move-result-object v73

    const-string v0, "CenturyPastSingularName"

    const-string v5, "vuosisata"

    filled-new-array {v0, v5}, [Ljava/lang/Object;

    move-result-object v74

    const-string v0, "CenturyPastPluralName"

    const-string v5, "vuosisataa"

    filled-new-array {v0, v5}, [Ljava/lang/Object;

    move-result-object v75

    const-string v0, "CenturyFutureSingularName"

    const-string v5, "vuosisadan"

    filled-new-array {v0, v5}, [Ljava/lang/Object;

    move-result-object v76

    const-string v0, "CenturyPastSuffix"

    filled-new-array {v0, v4}, [Ljava/lang/Object;

    move-result-object v77

    const-string v0, "CenturyFutureSuffix"

    filled-new-array {v0, v3}, [Ljava/lang/Object;

    move-result-object v78

    const-string v0, "MillenniumPattern"

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v79

    const-string v0, "MillenniumPluralPattern"

    filled-new-array {v0, v2}, [Ljava/lang/Object;

    move-result-object v80

    const-string v0, "MillenniumPastSingularName"

    const-string v1, "vuosituhat"

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v81

    const-string v0, "MillenniumPastPluralName"

    const-string v1, "vuosituhatta"

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v82

    const-string v0, "MillenniumFutureSingularName"

    const-string v1, "vuosituhannen"

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v83

    const-string v0, "MillenniumPastSuffix"

    filled-new-array {v0, v4}, [Ljava/lang/Object;

    move-result-object v84

    const-string v0, "MillenniumFutureSuffix"

    filled-new-array {v0, v3}, [Ljava/lang/Object;

    move-result-object v85

    move-object/from16 v2, v86

    move-object/from16 v3, v87

    move-object/from16 v4, v88

    move-object/from16 v5, v89

    filled-new-array/range {v2 .. v85}, [[Ljava/lang/Object;

    move-result-object v0

    sput-object v0, Lorg/ocpsoft/prettytime/i18n/Resources_fi;->b:[[Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/util/ListResourceBundle;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lorg/ocpsoft/prettytime/i18n/Resources_fi;->a:Ljava/util/Map;

    return-void
.end method

.method public static synthetic b(Lorg/ocpsoft/prettytime/i18n/Resources_fi;LAj/g;)LAj/f;
    .locals 0

    invoke-direct {p0, p1}, Lorg/ocpsoft/prettytime/i18n/Resources_fi;->c(LAj/g;)LAj/f;

    move-result-object p0

    return-object p0
.end method

.method private synthetic c(LAj/g;)LAj/f;
    .locals 1

    new-instance v0, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;

    invoke-direct {v0, p0, p1}, Lorg/ocpsoft/prettytime/i18n/Resources_fi$FiTimeFormat;-><init>(Ljava/util/ResourceBundle;LAj/g;)V

    return-object v0
.end method


# virtual methods
.method public a(LAj/g;)LAj/f;
    .locals 2

    iget-object v0, p0, Lorg/ocpsoft/prettytime/i18n/Resources_fi;->a:Ljava/util/Map;

    new-instance v1, Lorg/ocpsoft/prettytime/i18n/b;

    invoke-direct {v1, p0}, Lorg/ocpsoft/prettytime/i18n/b;-><init>(Lorg/ocpsoft/prettytime/i18n/Resources_fi;)V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LAj/f;

    return-object p1
.end method

.method protected getContents()[[Ljava/lang/Object;
    .locals 1

    sget-object v0, Lorg/ocpsoft/prettytime/i18n/Resources_fi;->b:[[Ljava/lang/Object;

    return-object v0
.end method
