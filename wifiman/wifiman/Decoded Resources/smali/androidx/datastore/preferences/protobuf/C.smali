.class abstract Landroidx/datastore/preferences/protobuf/C;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/datastore/preferences/protobuf/C$c;,
        Landroidx/datastore/preferences/protobuf/C$b;
    }
.end annotation


# static fields
.field private static final a:Landroidx/datastore/preferences/protobuf/C;

.field private static final b:Landroidx/datastore/preferences/protobuf/C;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/datastore/preferences/protobuf/C$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/datastore/preferences/protobuf/C$b;-><init>(Landroidx/datastore/preferences/protobuf/C$a;)V

    sput-object v0, Landroidx/datastore/preferences/protobuf/C;->a:Landroidx/datastore/preferences/protobuf/C;

    new-instance v0, Landroidx/datastore/preferences/protobuf/C$c;

    invoke-direct {v0, v1}, Landroidx/datastore/preferences/protobuf/C$c;-><init>(Landroidx/datastore/preferences/protobuf/C$a;)V

    sput-object v0, Landroidx/datastore/preferences/protobuf/C;->b:Landroidx/datastore/preferences/protobuf/C;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroidx/datastore/preferences/protobuf/C$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/datastore/preferences/protobuf/C;-><init>()V

    return-void
.end method

.method static a()Landroidx/datastore/preferences/protobuf/C;
    .locals 1

    sget-object v0, Landroidx/datastore/preferences/protobuf/C;->a:Landroidx/datastore/preferences/protobuf/C;

    return-object v0
.end method

.method static b()Landroidx/datastore/preferences/protobuf/C;
    .locals 1

    sget-object v0, Landroidx/datastore/preferences/protobuf/C;->b:Landroidx/datastore/preferences/protobuf/C;

    return-object v0
.end method


# virtual methods
.method abstract c(Ljava/lang/Object;J)V
.end method

.method abstract d(Ljava/lang/Object;Ljava/lang/Object;J)V
.end method

.method abstract e(Ljava/lang/Object;J)Ljava/util/List;
.end method
