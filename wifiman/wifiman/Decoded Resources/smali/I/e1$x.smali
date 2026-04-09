.class final LI/e1$x;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/e1;-><init>(LI/o1;LI/l1;LJ/j;LH/b;ZZLF/D;LH/d;ZLy/m;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LI/e1;


# direct methods
.method constructor <init>(LI/e1;)V
    .locals 0

    iput-object p1, p0, LI/e1$x;->a:LI/e1;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lu/a;
    .locals 1

    iget-object v0, p0, LI/e1$x;->a:LI/e1;

    invoke-static {v0}, Lu/b;->a(LD0/h;)Lu/a;

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI/e1$x;->a()Lu/a;

    const/4 v0, 0x0

    return-object v0
.end method
