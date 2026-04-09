.class public final Lf2/t$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf2/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lf2/t$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lf2/t;)Lzi/j;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lf2/t$a$a;->a:Lf2/t$a$a;

    invoke-static {p1, v0}, Lzi/m;->n(Ljava/lang/Object;Lmh/l;)Lzi/j;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lf2/t;)Lf2/r;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lf2/t$a;->a(Lf2/t;)Lzi/j;

    move-result-object p1

    invoke-static {p1}, Lzi/m;->M(Lzi/j;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf2/r;

    return-object p1
.end method
