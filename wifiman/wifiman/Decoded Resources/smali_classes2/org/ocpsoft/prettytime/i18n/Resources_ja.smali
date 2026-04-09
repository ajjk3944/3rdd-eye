.class public Lorg/ocpsoft/prettytime/i18n/Resources_ja;
.super Ljava/util/ListResourceBundle;
.source "SourceFile"

# interfaces
.implements LCj/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;
    }
.end annotation


# static fields
.field private static final b:[[Ljava/lang/Object;


# instance fields
.field private final a:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 99

    const-string v0, "CenturyPattern"

    const-string v1, "%n%u"

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v2

    const-string v0, "CenturyFuturePrefix"

    const-string v15, "\u4eca\u304b\u3089"

    filled-new-array {v0, v15}, [Ljava/lang/Object;

    move-result-object v3

    const-string v0, "CenturyFutureSuffix"

    const-string v14, "\u5f8c"

    filled-new-array {v0, v14}, [Ljava/lang/Object;

    move-result-object v4

    const-string v0, "CenturyPastPrefix"

    const-string v13, ""

    filled-new-array {v0, v13}, [Ljava/lang/Object;

    move-result-object v5

    const-string v0, "CenturyPastSuffix"

    const-string v12, "\u524d"

    filled-new-array {v0, v12}, [Ljava/lang/Object;

    move-result-object v6

    const-string v0, "CenturySingularName"

    const-string v8, "\u4e16\u7d00"

    filled-new-array {v0, v8}, [Ljava/lang/Object;

    move-result-object v7

    const-string v0, "CenturyPluralName"

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

    filled-new-array {v0, v13}, [Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v93, v2

    move-object v2, v12

    move-object v12, v0

    const-string v0, "DayPastSuffix"

    filled-new-array {v0, v2}, [Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v94, v3

    move-object v3, v13

    move-object v13, v0

    const-string v0, "DaySingularName"

    move-object/from16 v16, v15

    const-string v15, "\u65e5"

    filled-new-array {v0, v15}, [Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v95, v4

    move-object v4, v14

    move-object v14, v0

    const-string v0, "DayPluralName"

    filled-new-array {v0, v15}, [Ljava/lang/Object;

    move-result-object v15

    move-object/from16 v0, v16

    move-object/from16 v96, v5

    const-string v5, "DecadePattern"

    filled-new-array {v5, v1}, [Ljava/lang/Object;

    move-result-object v16

    const-string v5, "DecadeFuturePrefix"

    filled-new-array {v5, v0}, [Ljava/lang/Object;

    move-result-object v17

    const-string v5, "DecadeFutureSuffix"

    filled-new-array {v5, v4}, [Ljava/lang/Object;

    move-result-object v18

    const-string v5, "DecadePastPrefix"

    filled-new-array {v5, v3}, [Ljava/lang/Object;

    move-result-object v19

    const-string v5, "DecadePastSuffix"

    filled-new-array {v5, v2}, [Ljava/lang/Object;

    move-result-object v20

    const-string v5, "DecadeSingularName"

    move-object/from16 v97, v6

    const-string v6, "\u5e74"

    filled-new-array {v5, v6}, [Ljava/lang/Object;

    move-result-object v21

    const-string v5, "DecadePluralName"

    filled-new-array {v5, v6}, [Ljava/lang/Object;

    move-result-object v22

    const-string v5, "HourPattern"

    filled-new-array {v5, v1}, [Ljava/lang/Object;

    move-result-object v23

    const-string v5, "HourFuturePrefix"

    filled-new-array {v5, v0}, [Ljava/lang/Object;

    move-result-object v24

    const-string v5, "HourFutureSuffix"

    filled-new-array {v5, v4}, [Ljava/lang/Object;

    move-result-object v25

    const-string v5, "HourPastPrefix"

    filled-new-array {v5, v3}, [Ljava/lang/Object;

    move-result-object v26

    const-string v5, "HourPastSuffix"

    filled-new-array {v5, v2}, [Ljava/lang/Object;

    move-result-object v27

    const-string v5, "HourSingularName"

    move-object/from16 v98, v7

    const-string v7, "\u6642\u9593"

    filled-new-array {v5, v7}, [Ljava/lang/Object;

    move-result-object v28

    const-string v5, "HourPluralName"

    filled-new-array {v5, v7}, [Ljava/lang/Object;

    move-result-object v29

    const-string v5, "JustNowPattern"

    const-string v7, "%u"

    filled-new-array {v5, v7}, [Ljava/lang/Object;

    move-result-object v30

    const-string v5, "JustNowFuturePrefix"

    filled-new-array {v5, v0}, [Ljava/lang/Object;

    move-result-object v31

    const-string v5, "JustNowFutureSuffix"

    const-string v7, "\u3059\u3050"

    filled-new-array {v5, v7}, [Ljava/lang/Object;

    move-result-object v32

    const-string v5, "JustNowPastPrefix"

    filled-new-array {v5, v3}, [Ljava/lang/Object;

    move-result-object v33

    const-string v5, "JustNowPastSuffix"

    const-string v7, "\u305f\u3063\u305f\u4eca"

    filled-new-array {v5, v7}, [Ljava/lang/Object;

    move-result-object v34

    const-string v5, "JustNowSingularName"

    filled-new-array {v5, v3}, [Ljava/lang/Object;

    move-result-object v35

    const-string v5, "JustNowPluralName"

    filled-new-array {v5, v3}, [Ljava/lang/Object;

    move-result-object v36

    const-string v5, "MillenniumPattern"

    filled-new-array {v5, v1}, [Ljava/lang/Object;

    move-result-object v37

    const-string v5, "MillenniumFuturePrefix"

    filled-new-array {v5, v0}, [Ljava/lang/Object;

    move-result-object v38

    const-string v5, "MillenniumFutureSuffix"

    filled-new-array {v5, v4}, [Ljava/lang/Object;

    move-result-object v39

    const-string v5, "MillenniumPastPrefix"

    filled-new-array {v5, v3}, [Ljava/lang/Object;

    move-result-object v40

    const-string v5, "MillenniumPastSuffix"

    filled-new-array {v5, v2}, [Ljava/lang/Object;

    move-result-object v41

    const-string v5, "MillenniumSingularName"

    filled-new-array {v5, v6}, [Ljava/lang/Object;

    move-result-object v42

    const-string v5, "MillenniumPluralName"

    filled-new-array {v5, v6}, [Ljava/lang/Object;

    move-result-object v43

    const-string v5, "MillisecondPattern"

    filled-new-array {v5, v1}, [Ljava/lang/Object;

    move-result-object v44

    const-string v5, "MillisecondFuturePrefix"

    filled-new-array {v5, v0}, [Ljava/lang/Object;

    move-result-object v45

    const-string v5, "MillisecondFutureSuffix"

    filled-new-array {v5, v4}, [Ljava/lang/Object;

    move-result-object v46

    const-string v5, "MillisecondPastPrefix"

    filled-new-array {v5, v3}, [Ljava/lang/Object;

    move-result-object v47

    const-string v5, "MillisecondPastSuffix"

    filled-new-array {v5, v2}, [Ljava/lang/Object;

    move-result-object v48

    const-string v5, "MillisecondSingularName"

    const-string v7, "\u30df\u30ea\u79d2"

    filled-new-array {v5, v7}, [Ljava/lang/Object;

    move-result-object v49

    const-string v5, "MillisecondPluralName"

    filled-new-array {v5, v7}, [Ljava/lang/Object;

    move-result-object v50

    const-string v5, "MinutePattern"

    filled-new-array {v5, v1}, [Ljava/lang/Object;

    move-result-object v51

    const-string v5, "MinuteFuturePrefix"

    filled-new-array {v5, v0}, [Ljava/lang/Object;

    move-result-object v52

    const-string v5, "MinuteFutureSuffix"

    filled-new-array {v5, v4}, [Ljava/lang/Object;

    move-result-object v53

    const-string v5, "MinutePastPrefix"

    filled-new-array {v5, v3}, [Ljava/lang/Object;

    move-result-object v54

    const-string v5, "MinutePastSuffix"

    filled-new-array {v5, v2}, [Ljava/lang/Object;

    move-result-object v55

    const-string v5, "MinuteSingularName"

    const-string v7, "\u5206"

    filled-new-array {v5, v7}, [Ljava/lang/Object;

    move-result-object v56

    const-string v5, "MinutePluralName"

    filled-new-array {v5, v7}, [Ljava/lang/Object;

    move-result-object v57

    const-string v5, "MonthPattern"

    filled-new-array {v5, v1}, [Ljava/lang/Object;

    move-result-object v58

    const-string v5, "MonthFuturePrefix"

    filled-new-array {v5, v0}, [Ljava/lang/Object;

    move-result-object v59

    const-string v5, "MonthFutureSuffix"

    filled-new-array {v5, v4}, [Ljava/lang/Object;

    move-result-object v60

    const-string v5, "MonthPastPrefix"

    filled-new-array {v5, v3}, [Ljava/lang/Object;

    move-result-object v61

    const-string v5, "MonthPastSuffix"

    filled-new-array {v5, v2}, [Ljava/lang/Object;

    move-result-object v62

    const-string v5, "MonthSingularName"

    const-string v7, "\u30f6\u6708"

    filled-new-array {v5, v7}, [Ljava/lang/Object;

    move-result-object v63

    const-string v5, "MonthPluralName"

    filled-new-array {v5, v7}, [Ljava/lang/Object;

    move-result-object v64

    const-string v5, "SecondPattern"

    filled-new-array {v5, v1}, [Ljava/lang/Object;

    move-result-object v65

    const-string v5, "SecondFuturePrefix"

    filled-new-array {v5, v0}, [Ljava/lang/Object;

    move-result-object v66

    const-string v5, "SecondFutureSuffix"

    filled-new-array {v5, v4}, [Ljava/lang/Object;

    move-result-object v67

    const-string v5, "SecondPastPrefix"

    filled-new-array {v5, v3}, [Ljava/lang/Object;

    move-result-object v68

    const-string v5, "SecondPastSuffix"

    filled-new-array {v5, v2}, [Ljava/lang/Object;

    move-result-object v69

    const-string v5, "SecondSingularName"

    const-string v7, "\u79d2"

    filled-new-array {v5, v7}, [Ljava/lang/Object;

    move-result-object v70

    const-string v5, "SecondPluralName"

    filled-new-array {v5, v7}, [Ljava/lang/Object;

    move-result-object v71

    const-string v5, "WeekPattern"

    filled-new-array {v5, v1}, [Ljava/lang/Object;

    move-result-object v72

    const-string v5, "WeekFuturePrefix"

    filled-new-array {v5, v0}, [Ljava/lang/Object;

    move-result-object v73

    const-string v5, "WeekFutureSuffix"

    filled-new-array {v5, v4}, [Ljava/lang/Object;

    move-result-object v74

    const-string v5, "WeekPastPrefix"

    filled-new-array {v5, v3}, [Ljava/lang/Object;

    move-result-object v75

    const-string v5, "WeekPastSuffix"

    filled-new-array {v5, v2}, [Ljava/lang/Object;

    move-result-object v76

    const-string v5, "WeekSingularName"

    const-string v7, "\u9031\u9593"

    filled-new-array {v5, v7}, [Ljava/lang/Object;

    move-result-object v77

    const-string v5, "WeekPluralName"

    filled-new-array {v5, v7}, [Ljava/lang/Object;

    move-result-object v78

    const-string v5, "YearPattern"

    filled-new-array {v5, v1}, [Ljava/lang/Object;

    move-result-object v79

    const-string v1, "YearFuturePrefix"

    filled-new-array {v1, v0}, [Ljava/lang/Object;

    move-result-object v80

    const-string v0, "YearFutureSuffix"

    filled-new-array {v0, v4}, [Ljava/lang/Object;

    move-result-object v81

    const-string v0, "YearPastPrefix"

    filled-new-array {v0, v3}, [Ljava/lang/Object;

    move-result-object v82

    const-string v0, "YearPastSuffix"

    filled-new-array {v0, v2}, [Ljava/lang/Object;

    move-result-object v83

    const-string v0, "YearSingularName"

    filled-new-array {v0, v6}, [Ljava/lang/Object;

    move-result-object v84

    const-string v0, "YearPluralName"

    filled-new-array {v0, v6}, [Ljava/lang/Object;

    move-result-object v85

    const-string v0, "AbstractTimeUnitPattern"

    filled-new-array {v0, v3}, [Ljava/lang/Object;

    move-result-object v86

    const-string v0, "AbstractTimeUnitFuturePrefix"

    filled-new-array {v0, v3}, [Ljava/lang/Object;

    move-result-object v87

    const-string v0, "AbstractTimeUnitFutureSuffix"

    filled-new-array {v0, v3}, [Ljava/lang/Object;

    move-result-object v88

    const-string v0, "AbstractTimeUnitPastPrefix"

    filled-new-array {v0, v3}, [Ljava/lang/Object;

    move-result-object v89

    const-string v0, "AbstractTimeUnitPastSuffix"

    filled-new-array {v0, v3}, [Ljava/lang/Object;

    move-result-object v90

    const-string v0, "AbstractTimeUnitSingularName"

    filled-new-array {v0, v3}, [Ljava/lang/Object;

    move-result-object v91

    const-string v0, "AbstractTimeUnitPluralName"

    filled-new-array {v0, v3}, [Ljava/lang/Object;

    move-result-object v92

    move-object/from16 v2, v93

    move-object/from16 v3, v94

    move-object/from16 v4, v95

    move-object/from16 v5, v96

    move-object/from16 v6, v97

    move-object/from16 v7, v98

    filled-new-array/range {v2 .. v92}, [[Ljava/lang/Object;

    move-result-object v0

    sput-object v0, Lorg/ocpsoft/prettytime/i18n/Resources_ja;->b:[[Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/util/ListResourceBundle;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja;->a:Ljava/util/Map;

    return-void
.end method

.method public static synthetic b(Lorg/ocpsoft/prettytime/i18n/Resources_ja;LAj/g;)LAj/f;
    .locals 0

    invoke-direct {p0, p1}, Lorg/ocpsoft/prettytime/i18n/Resources_ja;->c(LAj/g;)LAj/f;

    move-result-object p0

    return-object p0
.end method

.method private synthetic c(LAj/g;)LAj/f;
    .locals 1

    new-instance v0, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;

    invoke-direct {v0, p0, p1}, Lorg/ocpsoft/prettytime/i18n/Resources_ja$JaTimeFormat;-><init>(Ljava/util/ResourceBundle;LAj/g;)V

    return-object v0
.end method


# virtual methods
.method public a(LAj/g;)LAj/f;
    .locals 2

    iget-object v0, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ja;->a:Ljava/util/Map;

    new-instance v1, Lorg/ocpsoft/prettytime/i18n/c;

    invoke-direct {v1, p0}, Lorg/ocpsoft/prettytime/i18n/c;-><init>(Lorg/ocpsoft/prettytime/i18n/Resources_ja;)V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LAj/f;

    return-object p1
.end method

.method public getContents()[[Ljava/lang/Object;
    .locals 1

    sget-object v0, Lorg/ocpsoft/prettytime/i18n/Resources_ja;->b:[[Ljava/lang/Object;

    return-object v0
.end method
