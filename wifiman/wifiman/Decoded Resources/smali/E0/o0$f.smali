.class final LE0/o0$f;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE0/o0;-><init>(Lmh/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LE0/o0$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LE0/o0$f;

    invoke-direct {v0}, LE0/o0$f;-><init>()V

    sput-object v0, LE0/o0$f;->a:LE0/o0$f;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LE0/G;)V
    .locals 7

    invoke-virtual {p1}, LE0/G;->h0()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, LE0/G;->s1(LE0/G;ZZZILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LE0/G;

    invoke-virtual {p0, p1}, LE0/o0$f;->a(LE0/G;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
