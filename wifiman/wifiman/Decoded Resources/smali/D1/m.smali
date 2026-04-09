.class public abstract LD1/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD1/m$e;,
        LD1/m$c;,
        LD1/m$b;,
        LD1/m$a;,
        LD1/m$f;,
        LD1/m$d;
    }
.end annotation


# static fields
.field public static final a:LD1/l;

.field public static final b:LD1/l;

.field public static final c:LD1/l;

.field public static final d:LD1/l;

.field public static final e:LD1/l;

.field public static final f:LD1/l;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LD1/m$e;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LD1/m$e;-><init>(LD1/m$c;Z)V

    sput-object v0, LD1/m;->a:LD1/l;

    new-instance v0, LD1/m$e;

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, LD1/m$e;-><init>(LD1/m$c;Z)V

    sput-object v0, LD1/m;->b:LD1/l;

    new-instance v0, LD1/m$e;

    sget-object v1, LD1/m$b;->a:LD1/m$b;

    invoke-direct {v0, v1, v2}, LD1/m$e;-><init>(LD1/m$c;Z)V

    sput-object v0, LD1/m;->c:LD1/l;

    new-instance v0, LD1/m$e;

    invoke-direct {v0, v1, v3}, LD1/m$e;-><init>(LD1/m$c;Z)V

    sput-object v0, LD1/m;->d:LD1/l;

    new-instance v0, LD1/m$e;

    sget-object v1, LD1/m$a;->b:LD1/m$a;

    invoke-direct {v0, v1, v2}, LD1/m$e;-><init>(LD1/m$c;Z)V

    sput-object v0, LD1/m;->e:LD1/l;

    sget-object v0, LD1/m$f;->b:LD1/m$f;

    sput-object v0, LD1/m;->f:LD1/l;

    return-void
.end method

.method static a(I)I
    .locals 1

    const/4 v0, 0x1

    if-eqz p0, :cond_1

    if-eq p0, v0, :cond_0

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    return v0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    return v0
.end method

.method static b(I)I
    .locals 2

    const/4 v0, 0x1

    if-eqz p0, :cond_1

    if-eq p0, v0, :cond_0

    const/4 v1, 0x2

    if-eq p0, v1, :cond_0

    packed-switch p0, :pswitch_data_0

    return v1

    :cond_0
    :pswitch_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :pswitch_1
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
