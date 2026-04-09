.class final LF/f$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/f;->c(LR0/Q;Lmh/l;Landroidx/compose/ui/e;ZZLL0/U;LF/D;LF/C;ZIILR0/c0;Lmh/l;Ly/m;Lm0/l0;Lmh/q;LT/l;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LF/f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF/f$a;

    invoke-direct {v0}, LF/f$a;-><init>()V

    sput-object v0, LF/f$a;->a:LF/f$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LL0/M;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LL0/M;

    invoke-virtual {p0, p1}, LF/f$a;->a(LL0/M;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
