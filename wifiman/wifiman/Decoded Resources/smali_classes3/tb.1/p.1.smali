.class public final synthetic Ltb/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/e;


# instance fields
.field public final synthetic a:Ltb/q;


# direct methods
.method public synthetic constructor <init>(Ltb/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltb/p;->a:Ltb/q;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    iget-object v0, p0, Ltb/p;->a:Ltb/q;

    invoke-static {v0}, Ltb/q;->c(Ltb/q;)V

    return-void
.end method
