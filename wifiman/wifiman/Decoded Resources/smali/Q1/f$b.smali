.class abstract LQ1/f$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQ1/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# static fields
.field static final a:Landroidx/datastore/preferences/protobuf/F;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Landroidx/datastore/preferences/protobuf/o0$b;->STRING:Landroidx/datastore/preferences/protobuf/o0$b;

    sget-object v1, Landroidx/datastore/preferences/protobuf/o0$b;->MESSAGE:Landroidx/datastore/preferences/protobuf/o0$b;

    invoke-static {}, LQ1/h;->Q()LQ1/h;

    move-result-object v2

    const-string v3, ""

    invoke-static {v0, v3, v1, v2}, Landroidx/datastore/preferences/protobuf/F;->d(Landroidx/datastore/preferences/protobuf/o0$b;Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/o0$b;Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/F;

    move-result-object v0

    sput-object v0, LQ1/f$b;->a:Landroidx/datastore/preferences/protobuf/F;

    return-void
.end method
