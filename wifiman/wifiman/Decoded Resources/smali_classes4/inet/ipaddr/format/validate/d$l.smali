.class public abstract Linet/ipaddr/format/validate/d$l;
.super Linet/ipaddr/format/validate/d$g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/format/validate/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "l"
.end annotation


# instance fields
.field protected final b:Linet/ipaddr/o;


# direct methods
.method constructor <init>(Linet/ipaddr/o;)V
    .locals 0

    invoke-direct {p0}, Linet/ipaddr/format/validate/d$g;-><init>()V

    iput-object p1, p0, Linet/ipaddr/format/validate/d$l;->b:Linet/ipaddr/o;

    return-void
.end method


# virtual methods
.method public getParameters()Linet/ipaddr/o;
    .locals 1

    iget-object v0, p0, Linet/ipaddr/format/validate/d$l;->b:Linet/ipaddr/o;

    return-object v0
.end method
