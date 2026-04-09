.class final synthetic LJh/D$a;
.super Lkotlin/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJh/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final a:LJh/D$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LJh/D$a;

    invoke-direct {v0}, LJh/D$a;-><init>()V

    sput-object v0, LJh/D$a;->a:LJh/D$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LZh/c;)LJh/O;
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LJh/B;->d(LZh/c;)LJh/O;

    move-result-object p1

    return-object p1
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "getDefaultReportLevelForAnnotation"

    return-object v0
.end method

.method public final getOwner()Lth/f;
    .locals 2

    const-class v0, LJh/B;

    const-string v1, "compiler.common.jvm"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/O;->d(Ljava/lang/Class;Ljava/lang/String;)Lth/f;

    move-result-object v0

    return-object v0
.end method

.method public final getSignature()Ljava/lang/String;
    .locals 1

    const-string v0, "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;"

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZh/c;

    invoke-virtual {p0, p1}, LJh/D$a;->a(LZh/c;)LJh/O;

    move-result-object p1

    return-object p1
.end method
