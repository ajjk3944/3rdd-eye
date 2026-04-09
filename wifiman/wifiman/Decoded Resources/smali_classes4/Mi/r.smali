.class public abstract LMi/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LNi/C;

.field public static final b:LNi/C;

.field public static final c:LNi/C;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LNi/C;

    const-string v1, "NULL"

    invoke-direct {v0, v1}, LNi/C;-><init>(Ljava/lang/String;)V

    sput-object v0, LMi/r;->a:LNi/C;

    new-instance v0, LNi/C;

    const-string v1, "UNINITIALIZED"

    invoke-direct {v0, v1}, LNi/C;-><init>(Ljava/lang/String;)V

    sput-object v0, LMi/r;->b:LNi/C;

    new-instance v0, LNi/C;

    const-string v1, "DONE"

    invoke-direct {v0, v1}, LNi/C;-><init>(Ljava/lang/String;)V

    sput-object v0, LMi/r;->c:LNi/C;

    return-void
.end method
