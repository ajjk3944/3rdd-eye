.class final LE0/P$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE0/P;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LE0/P$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LE0/P$a;

    invoke-direct {v0}, LE0/P$a;-><init>()V

    sput-object v0, LE0/P$a;->a:LE0/P$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LE0/r0;)V
    .locals 1

    invoke-virtual {p1}, LE0/r0;->h0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LE0/r0;->a()LE0/P;

    move-result-object v0

    invoke-static {v0, p1}, LE0/P;->T0(LE0/P;LE0/r0;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LE0/r0;

    invoke-virtual {p0, p1}, LE0/P$a;->a(LE0/r0;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
