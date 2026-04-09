.class public final synthetic LM6/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# instance fields
.field public final synthetic a:LM6/w;


# direct methods
.method public synthetic constructor <init>(LM6/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM6/s;->a:LM6/w;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LM6/s;->a:LM6/w;

    check-cast p1, LG6/P;

    invoke-static {v0, p1}, LM6/w;->p(LM6/w;LG6/P;)V

    return-void
.end method
