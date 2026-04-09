.class public final synthetic Ltb/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ltb/N;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ltb/N;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltb/G;->a:Ltb/N;

    iput-object p2, p0, Ltb/G;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ltb/G;->a:Ltb/N;

    iget-object v1, p0, Ltb/G;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Ltb/N;->q(Ltb/N;Ljava/lang/String;)V

    return-void
.end method
