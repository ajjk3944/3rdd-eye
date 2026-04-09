.class public final synthetic Ltb/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ltb/f;

.field public final synthetic b:Ltb/N;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ltb/f;Ltb/N;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltb/D;->a:Ltb/f;

    iput-object p2, p0, Ltb/D;->b:Ltb/N;

    iput-object p3, p0, Ltb/D;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Ltb/D;->a:Ltb/f;

    iget-object v1, p0, Ltb/D;->b:Ltb/N;

    iget-object v2, p0, Ltb/D;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ltb/N;->c(Ltb/f;Ltb/N;Ljava/lang/String;)V

    return-void
.end method
