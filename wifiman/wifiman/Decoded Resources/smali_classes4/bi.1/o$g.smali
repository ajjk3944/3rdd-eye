.class final Lbi/o$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbi/o;->p(LBh/b;Ljava/util/Queue;Lbi/n;)Ljava/util/Collection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lbi/n;

.field final synthetic b:LBh/b;


# direct methods
.method constructor <init>(Lbi/n;LBh/b;)V
    .locals 0

    iput-object p1, p0, Lbi/o$g;->a:Lbi/n;

    iput-object p2, p0, Lbi/o$g;->b:LBh/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LBh/b;)LYg/J;
    .locals 2

    iget-object v0, p0, Lbi/o$g;->a:Lbi/n;

    iget-object v1, p0, Lbi/o$g;->b:LBh/b;

    invoke-virtual {v0, v1, p1}, Lbi/n;->b(LBh/b;LBh/b;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LBh/b;

    invoke-virtual {p0, p1}, Lbi/o$g;->a(LBh/b;)LYg/J;

    move-result-object p1

    return-object p1
.end method
