.class public final synthetic Ltb/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ltb/N;

.field public final synthetic b:Ltb/f;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ltb/N;Ltb/f;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltb/w;->a:Ltb/N;

    iput-object p2, p0, Ltb/w;->b:Ltb/f;

    iput-object p3, p0, Ltb/w;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Ltb/w;->a:Ltb/N;

    iget-object v1, p0, Ltb/w;->b:Ltb/f;

    iget-object v2, p0, Ltb/w;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ltb/N;->b(Ltb/N;Ltb/f;Ljava/lang/String;)V

    return-void
.end method
