.class public final LF5/b;
.super LA5/f;
.source "SourceFile"


# static fields
.field private static final i:LC5/a;


# instance fields
.field private final d:LA5/h;

.field private final e:LF3/T;

.field private final f:LF3/U;

.field private final g:LF3/f0;

.field final h:LF3/B;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, LC5/a;->a()LC5/a;

    move-result-object v0

    sput-object v0, LF5/b;->i:LC5/a;

    return-void
.end method

.method constructor <init>(LA5/h;LE5/a;)V
    .locals 2

    const-string/jumbo v0, "object-detection"

    invoke-static {v0}, LF3/c0;->b(Ljava/lang/String;)LF3/T;

    move-result-object v0

    invoke-direct {p0}, LA5/f;-><init>()V

    const-string v1, "Context can not be null"

    invoke-static {p1, v1}, Ls3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v1, "ObjectDetectorOptions can not be null"

    invoke-static {p2, v1}, Ls3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v0, p0, LF5/b;->e:LF3/T;

    invoke-virtual {p1}, LA5/h;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LF3/U;->a(Landroid/content/Context;)LF3/U;

    move-result-object v0

    iput-object v0, p0, LF5/b;->f:LF3/U;

    iput-object p1, p0, LF5/b;->d:LA5/h;

    invoke-static {p2}, LF5/d;->a(LE5/a;)LF3/B;

    invoke-virtual {p1}, LA5/h;->b()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, LF3/f0;->a(Landroid/content/Context;)LF3/f0;

    move-result-object p1

    iput-object p1, p0, LF5/b;->g:LF3/f0;

    return-void
.end method
