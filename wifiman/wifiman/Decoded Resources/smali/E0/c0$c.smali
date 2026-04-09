.class final LE0/c0$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE0/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LE0/c0$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LE0/c0$c;

    invoke-direct {v0}, LE0/c0$c;-><init>()V

    sput-object v0, LE0/c0$c;->a:LE0/c0$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LE0/c0;)V
    .locals 0

    invoke-virtual {p1}, LE0/c0;->B2()LE0/l0;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, LE0/l0;->invalidate()V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LE0/c0;

    invoke-virtual {p0, p1}, LE0/c0$c;->a(LE0/c0;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
