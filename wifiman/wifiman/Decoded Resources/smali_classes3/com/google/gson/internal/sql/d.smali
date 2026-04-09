.class public abstract Lcom/google/gson/internal/sql/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Z

.field public static final b:Lcom/google/gson/internal/bind/c$b;

.field public static final c:Lcom/google/gson/internal/bind/c$b;

.field public static final d:Lcom/google/gson/q;

.field public static final e:Lcom/google/gson/q;

.field public static final f:Lcom/google/gson/q;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    :try_start_0
    const-string/jumbo v0, "java.sql.Date"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lcom/google/gson/internal/sql/d;->a:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/gson/internal/sql/d$a;

    const-class v1, Ljava/sql/Date;

    invoke-direct {v0, v1}, Lcom/google/gson/internal/sql/d$a;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lcom/google/gson/internal/sql/d;->b:Lcom/google/gson/internal/bind/c$b;

    new-instance v0, Lcom/google/gson/internal/sql/d$b;

    const-class v1, Ljava/sql/Timestamp;

    invoke-direct {v0, v1}, Lcom/google/gson/internal/sql/d$b;-><init>(Ljava/lang/Class;)V

    sput-object v0, Lcom/google/gson/internal/sql/d;->c:Lcom/google/gson/internal/bind/c$b;

    sget-object v0, Lcom/google/gson/internal/sql/a;->b:Lcom/google/gson/q;

    sput-object v0, Lcom/google/gson/internal/sql/d;->d:Lcom/google/gson/q;

    sget-object v0, Lcom/google/gson/internal/sql/b;->b:Lcom/google/gson/q;

    sput-object v0, Lcom/google/gson/internal/sql/d;->e:Lcom/google/gson/q;

    sget-object v0, Lcom/google/gson/internal/sql/c;->b:Lcom/google/gson/q;

    sput-object v0, Lcom/google/gson/internal/sql/d;->f:Lcom/google/gson/q;

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    sput-object v0, Lcom/google/gson/internal/sql/d;->b:Lcom/google/gson/internal/bind/c$b;

    sput-object v0, Lcom/google/gson/internal/sql/d;->c:Lcom/google/gson/internal/bind/c$b;

    sput-object v0, Lcom/google/gson/internal/sql/d;->d:Lcom/google/gson/q;

    sput-object v0, Lcom/google/gson/internal/sql/d;->e:Lcom/google/gson/q;

    sput-object v0, Lcom/google/gson/internal/sql/d;->f:Lcom/google/gson/q;

    :goto_1
    return-void
.end method
