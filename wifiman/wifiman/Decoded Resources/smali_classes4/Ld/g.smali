.class public final synthetic LLd/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LLd/h;


# direct methods
.method public synthetic constructor <init>(LLd/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLd/g;->a:LLd/h;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LLd/g;->a:LLd/h;

    check-cast p1, Ll9/a;

    invoke-static {v0, p1}, LLd/h;->b(LLd/h;Ll9/a;)Lgg/b;

    move-result-object p1

    return-object p1
.end method
