.class public final synthetic Lag/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/IntFunction;


# instance fields
.field public final synthetic a:Lag/d;


# direct methods
.method public synthetic constructor <init>(Lag/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lag/c;->a:Lag/d;

    return-void
.end method


# virtual methods
.method public final apply(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lag/c;->a:Lag/d;

    invoke-static {v0, p1}, Lag/d;->g(Lag/d;I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
