.class public final synthetic LDc/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/a;


# instance fields
.field public final synthetic a:Linet/ipaddr/g;

.field public final synthetic b:LDc/t;


# direct methods
.method public synthetic constructor <init>(Linet/ipaddr/g;LDc/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDc/u;->a:Linet/ipaddr/g;

    iput-object p2, p0, LDc/u;->b:LDc/t;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LDc/u;->a:Linet/ipaddr/g;

    iget-object v1, p0, LDc/u;->b:LDc/t;

    invoke-static {v0, v1}, LDc/t$f;->a(Linet/ipaddr/g;LDc/t;)V

    return-void
.end method
