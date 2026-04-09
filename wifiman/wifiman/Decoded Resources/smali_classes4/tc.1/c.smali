.class public final synthetic Ltc/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/e;


# instance fields
.field public final synthetic a:Ltc/d;

.field public final synthetic b:Ltc/d$a;


# direct methods
.method public synthetic constructor <init>(Ltc/d;Ltc/d$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltc/c;->a:Ltc/d;

    iput-object p2, p0, Ltc/c;->b:Ltc/d$a;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 2

    iget-object v0, p0, Ltc/c;->a:Ltc/d;

    iget-object v1, p0, Ltc/c;->b:Ltc/d$a;

    invoke-static {v0, v1}, Ltc/d;->c(Ltc/d;Ltc/d$a;)V

    return-void
.end method
