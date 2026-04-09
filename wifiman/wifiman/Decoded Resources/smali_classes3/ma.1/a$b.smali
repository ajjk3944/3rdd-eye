.class public final Lma/a$b;
.super Lma/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lma/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:Lma/a$b;

.field private static final b:Lma/a$f;

.field private static final c:Lma/a$f;

.field private static final d:Lma/a$c;

.field private static final e:Lma/a$e;

.field private static final f:J

.field private static final g:J

.field private static final h:Lma/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 34

    new-instance v0, Lma/a$b;

    invoke-direct {v0}, Lma/a$b;-><init>()V

    sput-object v0, Lma/a$b;->a:Lma/a$b;

    new-instance v0, Lma/a$f;

    sget-object v11, Lr9/a;->a:Lr9/a;

    invoke-virtual {v11}, Lr9/a;->n()Lr9/a$b;

    move-result-object v1

    invoke-virtual {v1}, Lr9/a$b;->d()J

    move-result-wide v2

    invoke-virtual {v11}, Lr9/a;->n()Lr9/a$b;

    move-result-object v1

    invoke-virtual {v1}, Lr9/a$b;->c()J

    move-result-wide v4

    invoke-virtual {v11}, Lr9/a;->n()Lr9/a$b;

    move-result-object v1

    invoke-virtual {v1}, Lr9/a$b;->j()J

    move-result-wide v6

    invoke-virtual {v11}, Lr9/a;->n()Lr9/a$b;

    move-result-object v1

    invoke-virtual {v1}, Lr9/a$b;->i()J

    move-result-wide v8

    const/4 v10, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v10}, Lma/a$f;-><init>(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lma/a$b;->b:Lma/a$f;

    new-instance v0, Lma/a$f;

    invoke-virtual {v11}, Lr9/a;->m()Lr9/a$b;

    move-result-object v1

    invoke-virtual {v1}, Lr9/a$b;->d()J

    move-result-wide v13

    invoke-virtual {v11}, Lr9/a;->m()Lr9/a$b;

    move-result-object v1

    invoke-virtual {v1}, Lr9/a$b;->c()J

    move-result-wide v15

    invoke-virtual {v11}, Lr9/a;->m()Lr9/a$b;

    move-result-object v1

    invoke-virtual {v1}, Lr9/a$b;->j()J

    move-result-wide v17

    invoke-virtual {v11}, Lr9/a;->m()Lr9/a$b;

    move-result-object v1

    invoke-virtual {v1}, Lr9/a$b;->i()J

    move-result-wide v19

    const/16 v21, 0x0

    move-object v12, v0

    invoke-direct/range {v12 .. v21}, Lma/a$f;-><init>(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lma/a$b;->c:Lma/a$f;

    new-instance v0, Lma/a$c;

    invoke-virtual {v11}, Lr9/a;->n()Lr9/a$b;

    move-result-object v1

    invoke-virtual {v1}, Lr9/a$b;->j()J

    move-result-wide v23

    invoke-virtual {v11}, Lr9/a;->d()Lr9/a$a;

    move-result-object v1

    invoke-virtual {v1}, Lr9/a$a;->f()J

    move-result-wide v25

    invoke-virtual {v11}, Lr9/a;->f()Lr9/a$a;

    move-result-object v1

    invoke-virtual {v1}, Lr9/a$a;->f()J

    move-result-wide v27

    invoke-virtual {v11}, Lr9/a;->p()Lr9/a$a;

    move-result-object v1

    invoke-virtual {v1}, Lr9/a$a;->f()J

    move-result-wide v29

    invoke-virtual {v11}, Lr9/a;->t()Lr9/a$a;

    move-result-object v1

    invoke-virtual {v1}, Lr9/a$a;->f()J

    move-result-wide v31

    const/16 v33, 0x0

    move-object/from16 v22, v0

    invoke-direct/range {v22 .. v33}, Lma/a$c;-><init>(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lma/a$b;->d:Lma/a$c;

    new-instance v0, Lma/a$e;

    invoke-virtual {v11}, Lr9/a;->v()Lr9/a$c;

    move-result-object v1

    invoke-direct {v0, v1}, Lma/a$e;-><init>(Lr9/a$c;)V

    sput-object v0, Lma/a$b;->e:Lma/a$e;

    invoke-virtual {v11}, Lr9/a;->n()Lr9/a$b;

    move-result-object v0

    invoke-virtual {v0}, Lr9/a$b;->a()J

    move-result-wide v1

    const/16 v7, 0xe

    const/4 v8, 0x0

    const v3, 0x3ea3d70a    # 0.32f

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v0

    sput-wide v0, Lma/a$b;->f:J

    invoke-virtual {v11}, Lr9/a;->n()Lr9/a$b;

    move-result-object v0

    invoke-virtual {v0}, Lr9/a$b;->e()J

    move-result-wide v0

    sput-wide v0, Lma/a$b;->g:J

    new-instance v0, Lma/a$a;

    invoke-virtual {v11}, Lr9/a;->n()Lr9/a$b;

    move-result-object v13

    invoke-virtual {v11}, Lr9/a;->m()Lr9/a$b;

    move-result-object v14

    invoke-virtual {v11}, Lr9/a;->d()Lr9/a$a;

    move-result-object v15

    invoke-virtual {v11}, Lr9/a;->j()Lr9/a$a;

    move-result-object v16

    invoke-virtual {v11}, Lr9/a;->b()Lr9/a$a;

    move-result-object v17

    invoke-virtual {v11}, Lr9/a;->f()Lr9/a$a;

    move-result-object v18

    invoke-virtual {v11}, Lr9/a;->h()Lr9/a$a;

    move-result-object v19

    invoke-virtual {v11}, Lr9/a;->x()Lr9/a$a;

    move-result-object v20

    invoke-virtual {v11}, Lr9/a;->p()Lr9/a$a;

    move-result-object v21

    invoke-virtual {v11}, Lr9/a;->t()Lr9/a$a;

    move-result-object v22

    invoke-virtual {v11}, Lr9/a;->r()Lr9/a$a;

    move-result-object v23

    move-object v12, v0

    invoke-direct/range {v12 .. v23}, Lma/a$a;-><init>(Lr9/a$b;Lr9/a$b;Lr9/a$a;Lr9/a$a;Lr9/a$a;Lr9/a$a;Lr9/a$a;Lr9/a$a;Lr9/a$a;Lr9/a$a;Lr9/a$a;)V

    sput-object v0, Lma/a$b;->h:Lma/a$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lma/a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public a()Lma/a$a;
    .locals 1

    sget-object v0, Lma/a$b;->h:Lma/a$a;

    return-object v0
.end method

.method public b()J
    .locals 2

    sget-wide v0, Lma/a$b;->g:J

    return-wide v0
.end method

.method public c()Lma/a$c;
    .locals 1

    sget-object v0, Lma/a$b;->d:Lma/a$c;

    return-object v0
.end method

.method public d()J
    .locals 2

    sget-wide v0, Lma/a$b;->f:J

    return-wide v0
.end method

.method public e()Lma/a$e;
    .locals 1

    sget-object v0, Lma/a$b;->e:Lma/a$e;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lma/a$b;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public f()Lma/a$f;
    .locals 1

    sget-object v0, Lma/a$b;->b:Lma/a$f;

    return-object v0
.end method

.method public g()Lma/a$f;
    .locals 1

    sget-object v0, Lma/a$b;->c:Lma/a$f;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x7a84f970

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Dark"

    return-object v0
.end method
