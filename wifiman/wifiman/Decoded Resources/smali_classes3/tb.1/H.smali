.class public final synthetic Ltb/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ltb/N;


# direct methods
.method public synthetic constructor <init>(Ltb/N;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltb/H;->a:Ltb/N;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ltb/H;->a:Ltb/N;

    invoke-static {v0}, Ltb/N;->k(Ltb/N;)V

    return-void
.end method
