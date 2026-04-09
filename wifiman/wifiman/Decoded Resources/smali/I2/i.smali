.class public interface abstract LI2/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LI2/i;

.field public static final b:LI2/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LI2/i$a;

    invoke-direct {v0}, LI2/i$a;-><init>()V

    sput-object v0, LI2/i;->a:LI2/i;

    new-instance v0, LI2/k$a;

    invoke-direct {v0}, LI2/k$a;-><init>()V

    invoke-virtual {v0}, LI2/k$a;->a()LI2/k;

    move-result-object v0

    sput-object v0, LI2/i;->b:LI2/i;

    return-void
.end method


# virtual methods
.method public abstract a()Ljava/util/Map;
.end method
