.class public final LS8/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LS8/e;
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
    invoke-direct {p0}, LS8/e$a;-><init>()V

    return-void
.end method

.method private final a(LS8/e;)I
    .locals 3

    sget-object v0, LKb/a;->a:LKb/a;

    invoke-virtual {p1}, LS8/e;->d()I

    move-result v1

    invoke-virtual {p1}, LS8/e;->b()LS8/d;

    move-result-object v2

    invoke-virtual {v2}, LS8/d;->getWidth()I

    move-result v2

    invoke-virtual {p1}, LS8/e;->e()LS8/e$b;

    move-result-object p1

    invoke-virtual {p1}, LS8/e$b;->a()I

    move-result p1

    invoke-virtual {v0, v1, v2, p1}, LKb/a;->i7(III)I

    move-result p1

    return p1
.end method


# virtual methods
.method public final b(LS8/e;LS8/e;)Ljava/lang/Double;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "channel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LKb/a;->a:LKb/a;

    invoke-direct {p0, p1}, LS8/e$a;->a(LS8/e;)I

    move-result p1

    invoke-direct {p0, p2}, LS8/e$a;->a(LS8/e;)I

    move-result p2

    invoke-virtual {v0, p1, p2}, LKb/a;->j7(II)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method
