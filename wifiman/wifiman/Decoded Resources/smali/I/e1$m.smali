.class final LI/e1$m;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


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

    iput-object p1, p0, LI/e1$m;->a:LI/e1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Li0/b;)V
    .locals 0

    iget-object p1, p0, LI/e1$m;->a:LI/e1;

    invoke-static {p1}, Lu/b;->a(LD0/h;)Lu/a;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li0/b;

    invoke-virtual {p0, p1}, LI/e1$m;->a(Li0/b;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
