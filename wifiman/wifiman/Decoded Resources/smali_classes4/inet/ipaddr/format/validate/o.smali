.class public final synthetic Linet/ipaddr/format/validate/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Linet/ipaddr/a$a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:[I


# direct methods
.method public synthetic constructor <init>(II[I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Linet/ipaddr/format/validate/o;->a:I

    iput p2, p0, Linet/ipaddr/format/validate/o;->b:I

    iput-object p3, p0, Linet/ipaddr/format/validate/o;->c:[I

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 3

    iget v0, p0, Linet/ipaddr/format/validate/o;->a:I

    iget v1, p0, Linet/ipaddr/format/validate/o;->b:I

    iget-object v2, p0, Linet/ipaddr/format/validate/o;->c:[I

    invoke-static {v0, v1, v2, p1}, Linet/ipaddr/format/validate/r;->z1(II[II)I

    move-result p1

    return p1
.end method
