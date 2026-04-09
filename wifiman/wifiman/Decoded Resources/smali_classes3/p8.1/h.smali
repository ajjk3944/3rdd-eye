.class public final synthetic Lp8/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LLe/c;


# direct methods
.method public synthetic constructor <init>(LLe/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp8/h;->a:LLe/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lp8/h;->a:LLe/c;

    check-cast p1, Lde/s;

    invoke-static {v0, p1}, Lp8/i;->A0(LLe/c;Lde/s;)Lde/s;

    move-result-object p1

    return-object p1
.end method
