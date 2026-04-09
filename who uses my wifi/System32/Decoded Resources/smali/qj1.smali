.class public final Lqj1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:J

.field public final d:J

.field public final e:J

.field public final f:J

.field public final g:Lph4;

.field public final h:I

.field public final i:[J

.field public final j:[J

.field public final k:I

.field public final l:[Lrj1;


# direct methods
.method public constructor <init>(IIJJJJLph4;I[Lrj1;I[J[J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lqj1;->a:I

    .line 5
    .line 6
    iput p2, p0, Lqj1;->b:I

    .line 7
    .line 8
    iput-wide p3, p0, Lqj1;->c:J

    .line 9
    .line 10
    iput-wide p5, p0, Lqj1;->d:J

    .line 11
    .line 12
    iput-wide p7, p0, Lqj1;->e:J

    .line 13
    .line 14
    iput-wide p9, p0, Lqj1;->f:J

    .line 15
    .line 16
    iput-object p11, p0, Lqj1;->g:Lph4;

    .line 17
    .line 18
    iput p12, p0, Lqj1;->h:I

    .line 19
    .line 20
    iput-object p13, p0, Lqj1;->l:[Lrj1;

    .line 21
    .line 22
    iput p14, p0, Lqj1;->k:I

    .line 23
    .line 24
    iput-object p15, p0, Lqj1;->i:[J

    .line 25
    .line 26
    move-object/from16 p1, p16

    .line 27
    .line 28
    iput-object p1, p0, Lqj1;->j:[J

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final a(Lph4;)Lqj1;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lqj1;

    .line 4
    .line 5
    iget-wide v8, v0, Lqj1;->e:J

    .line 6
    .line 7
    iget-wide v10, v0, Lqj1;->f:J

    .line 8
    .line 9
    iget v2, v0, Lqj1;->a:I

    .line 10
    .line 11
    iget v3, v0, Lqj1;->b:I

    .line 12
    .line 13
    iget-wide v4, v0, Lqj1;->c:J

    .line 14
    .line 15
    iget-wide v6, v0, Lqj1;->d:J

    .line 16
    .line 17
    iget v13, v0, Lqj1;->h:I

    .line 18
    .line 19
    iget-object v14, v0, Lqj1;->l:[Lrj1;

    .line 20
    .line 21
    iget v15, v0, Lqj1;->k:I

    .line 22
    .line 23
    iget-object v12, v0, Lqj1;->i:[J

    .line 24
    .line 25
    move-object/from16 v16, v1

    .line 26
    .line 27
    iget-object v1, v0, Lqj1;->j:[J

    .line 28
    .line 29
    move-object/from16 v17, v1

    .line 30
    .line 31
    move-object/from16 v1, v16

    .line 32
    .line 33
    move-object/from16 v16, v12

    .line 34
    .line 35
    move-object/from16 v12, p1

    .line 36
    .line 37
    invoke-direct/range {v1 .. v17}, Lqj1;-><init>(IIJJJJLph4;I[Lrj1;I[J[J)V

    .line 38
    .line 39
    .line 40
    move-object/from16 v16, v1

    .line 41
    .line 42
    return-object v16
.end method
