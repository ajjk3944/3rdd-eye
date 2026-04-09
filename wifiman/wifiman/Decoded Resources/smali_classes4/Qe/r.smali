.class public final synthetic LQe/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lf2/w;


# direct methods
.method public synthetic constructor <init>(Lf2/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQe/r;->a:Lf2/w;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LQe/r;->a:Lf2/w;

    check-cast p1, Lf2/z;

    invoke-static {v0, p1}, LQe/q$a$b;->n(Lf2/w;Lf2/z;)LYg/J;

    move-result-object p1

    return-object p1
.end method
