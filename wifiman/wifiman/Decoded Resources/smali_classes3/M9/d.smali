.class public final synthetic LM9/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lk0/e;


# direct methods
.method public synthetic constructor <init>(Lk0/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM9/d;->a:Lk0/e;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LM9/d;->a:Lk0/e;

    check-cast p1, Ll0/g;

    invoke-static {v0, p1}, LM9/e$a$a;->n(Lk0/e;Ll0/g;)LYg/J;

    move-result-object p1

    return-object p1
.end method
