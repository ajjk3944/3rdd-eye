.class public abstract LSi/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lmh/q;

.field private static final b:LNi/C;

.field private static final c:LNi/C;

.field private static final d:LNi/C;

.field private static final e:LNi/C;

.field private static final f:LNi/C;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, LSi/f$a;->a:LSi/f$a;

    sput-object v0, LSi/f;->a:Lmh/q;

    new-instance v0, LNi/C;

    const-string v1, "STATE_REG"

    invoke-direct {v0, v1}, LNi/C;-><init>(Ljava/lang/String;)V

    sput-object v0, LSi/f;->b:LNi/C;

    new-instance v0, LNi/C;

    const-string v1, "STATE_COMPLETED"

    invoke-direct {v0, v1}, LNi/C;-><init>(Ljava/lang/String;)V

    sput-object v0, LSi/f;->c:LNi/C;

    new-instance v0, LNi/C;

    const-string v1, "STATE_CANCELLED"

    invoke-direct {v0, v1}, LNi/C;-><init>(Ljava/lang/String;)V

    sput-object v0, LSi/f;->d:LNi/C;

    new-instance v0, LNi/C;

    const-string v1, "NO_RESULT"

    invoke-direct {v0, v1}, LNi/C;-><init>(Ljava/lang/String;)V

    sput-object v0, LSi/f;->e:LNi/C;

    new-instance v0, LNi/C;

    const-string v1, "PARAM_CLAUSE_0"

    invoke-direct {v0, v1}, LNi/C;-><init>(Ljava/lang/String;)V

    sput-object v0, LSi/f;->f:LNi/C;

    return-void
.end method

.method public static final synthetic a()Lmh/q;
    .locals 1

    sget-object v0, LSi/f;->a:Lmh/q;

    return-object v0
.end method
