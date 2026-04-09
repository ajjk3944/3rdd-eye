.class final LI/g1$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/g1;->b(Landroid/view/KeyEvent;LI/o1;LI/l1;LJ/j;ZZLmh/a;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LI/g1$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LI/g1$b;

    invoke-direct {v0}, LI/g1$b;-><init>()V

    sput-object v0, LI/g1$b;->a:LI/g1$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LJ/h;)V
    .locals 0

    invoke-virtual {p1}, LJ/h;->D()LJ/h;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LJ/h;

    invoke-virtual {p0, p1}, LI/g1$b;->a(LJ/h;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
