.class public interface abstract Linet/ipaddr/format/validate/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x80

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    sput v0, Linet/ipaddr/format/validate/b;->a:I

    return-void
.end method


# virtual methods
.method public abstract a(Linet/ipaddr/n;)Linet/ipaddr/format/validate/d;
.end method

.method public abstract b(Linet/ipaddr/e;)Linet/ipaddr/format/validate/h;
.end method
