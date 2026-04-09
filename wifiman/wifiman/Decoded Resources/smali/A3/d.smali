.class public abstract LA3/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lr3/d;

.field public static final b:[Lr3/d;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lr3/d;

    const-string v1, "CLIENT_TELEMETRY"

    const-wide/16 v2, 0x1

    invoke-direct {v0, v1, v2, v3}, Lr3/d;-><init>(Ljava/lang/String;J)V

    sput-object v0, LA3/d;->a:Lr3/d;

    filled-new-array {v0}, [Lr3/d;

    move-result-object v0

    sput-object v0, LA3/d;->b:[Lr3/d;

    return-void
.end method
