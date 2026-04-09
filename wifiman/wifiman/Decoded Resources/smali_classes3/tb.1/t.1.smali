.class public final synthetic Ltb/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/e;


# instance fields
.field public final synthetic a:Ltb/q;

.field public final synthetic b:Ltb/u;


# direct methods
.method public synthetic constructor <init>(Ltb/q;Ltb/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltb/t;->a:Ltb/q;

    iput-object p2, p0, Ltb/t;->b:Ltb/u;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 2

    iget-object v0, p0, Ltb/t;->a:Ltb/q;

    iget-object v1, p0, Ltb/t;->b:Ltb/u;

    invoke-static {v0, v1}, Ltb/u;->a(Ltb/q;Ltb/u;)V

    return-void
.end method
