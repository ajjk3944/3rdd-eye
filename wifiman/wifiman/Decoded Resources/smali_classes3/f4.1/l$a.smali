.class abstract Lf4/l$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf4/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# static fields
.field static final a:Lf4/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf4/l;

    invoke-direct {v0}, Lf4/l;-><init>()V

    sput-object v0, Lf4/l$a;->a:Lf4/l;

    return-void
.end method
