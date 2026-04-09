.class public abstract Linet/ipaddr/format/validate/r$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/format/validate/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "j"
.end annotation


# instance fields
.field private final a:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Linet/ipaddr/format/validate/r$j;->a:Z

    return-void
.end method


# virtual methods
.method public a(JJ)J
    .locals 0

    and-long/2addr p1, p3

    return-wide p1
.end method

.method public c(JJ)J
    .locals 0

    and-long/2addr p1, p3

    return-wide p1
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Linet/ipaddr/format/validate/r$j;->a:Z

    return v0
.end method
