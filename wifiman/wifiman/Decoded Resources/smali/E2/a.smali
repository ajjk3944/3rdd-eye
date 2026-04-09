.class public abstract LE2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LE2/a;

.field public static final b:LE2/a;

.field public static final c:LE2/a;

.field public static final d:LE2/a;

.field public static final e:LE2/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LE2/a$a;

    invoke-direct {v0}, LE2/a$a;-><init>()V

    sput-object v0, LE2/a;->a:LE2/a;

    new-instance v0, LE2/a$b;

    invoke-direct {v0}, LE2/a$b;-><init>()V

    sput-object v0, LE2/a;->b:LE2/a;

    new-instance v0, LE2/a$c;

    invoke-direct {v0}, LE2/a$c;-><init>()V

    sput-object v0, LE2/a;->c:LE2/a;

    new-instance v0, LE2/a$d;

    invoke-direct {v0}, LE2/a$d;-><init>()V

    sput-object v0, LE2/a;->d:LE2/a;

    new-instance v0, LE2/a$e;

    invoke-direct {v0}, LE2/a$e;-><init>()V

    sput-object v0, LE2/a;->e:LE2/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Z
.end method

.method public abstract b()Z
.end method

.method public abstract c(LC2/a;)Z
.end method

.method public abstract d(ZLC2/a;LC2/c;)Z
.end method
