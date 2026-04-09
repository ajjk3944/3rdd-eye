.class public final synthetic LId/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/k;


# instance fields
.field public final synthetic a:LId/d;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LId/d;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LId/e;->a:LId/d;

    iput-object p2, p0, LId/e;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Lgg/j;)V
    .locals 2

    iget-object v0, p0, LId/e;->a:LId/d;

    iget-object v1, p0, LId/e;->b:Ljava/lang/String;

    invoke-static {v0, v1, p1}, LId/d$c;->a(LId/d;Ljava/lang/String;Lgg/j;)V

    return-void
.end method
