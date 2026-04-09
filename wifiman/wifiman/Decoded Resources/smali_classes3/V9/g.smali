.class public final LV9/g;
.super LV9/f;
.source "SourceFile"


# instance fields
.field private final e:LU9/h;

.field private final f:Lmh/a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LU9/h;Lmh/a;)V
    .locals 1

    const-string/jumbo v0, "activityController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "onCreateAccountClicked"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LV9/f;-><init>()V

    iput-object p1, p0, LV9/g;->e:LU9/h;

    iput-object p2, p0, LV9/g;->f:Lmh/a;

    return-void
.end method


# virtual methods
.method public H(Ldh/e;)Ljava/lang/Object;
    .locals 1

    iget-object p1, p0, LV9/g;->e:LU9/h;

    sget-object v0, LU9/h$a$a$a;->a:LU9/h$a$a$a;

    invoke-virtual {p1, v0}, LU9/h;->e0(LU9/h$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public e0(Ldh/e;)Ljava/lang/Object;
    .locals 1

    iget-object p1, p0, LV9/g;->e:LU9/h;

    sget-object v0, LU9/h$a$a$a;->a:LU9/h$a$a$a;

    invoke-virtual {p1, v0}, LU9/h;->e0(LU9/h$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public f0(Ldh/e;)Ljava/lang/Object;
    .locals 0

    iget-object p1, p0, LV9/g;->f:Lmh/a;

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
