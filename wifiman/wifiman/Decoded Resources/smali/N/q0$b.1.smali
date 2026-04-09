.class final LN/q0$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/q0;->a(LR0/Q;Lmh/l;Landroidx/compose/ui/e;ZZLL0/U;Lmh/p;Lmh/p;Lmh/p;Lmh/p;ZLR0/c0;LF/D;LF/C;ZIILy/m;Lm0/i1;LN/S0;LT/l;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LN/q0$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN/q0$b;

    invoke-direct {v0}, LN/q0$b;-><init>()V

    sput-object v0, LN/q0$b;->a:LN/q0$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LJ0/w;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LJ0/w;

    invoke-virtual {p0, p1}, LN/q0$b;->a(LJ0/w;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
