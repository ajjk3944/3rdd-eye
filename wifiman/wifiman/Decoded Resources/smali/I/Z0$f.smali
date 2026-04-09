.class final LI/Z0$f;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/Z0;->finishComposingText()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LI/Z0$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LI/Z0$f;

    invoke-direct {v0}, LI/Z0$f;-><init>()V

    sput-object v0, LI/Z0$f;->a:LI/Z0$f;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LI/I;)V
    .locals 0

    invoke-static {p1}, LI/H;->e(LI/I;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LI/I;

    invoke-virtual {p0, p1}, LI/Z0$f;->a(LI/I;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
