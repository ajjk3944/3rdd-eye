.class public final Lgg4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public A:I

.field public B:Ln74;

.field public C:I

.field public D:I

.field public E:I

.field public F:I

.field public G:I

.field public H:I

.field public I:I

.field public J:I

.field public K:I

.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Lxm3;

.field public d:Ljava/lang/String;

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:Ljava/lang/String;

.field public j:Lwn1;

.field public k:Ljava/lang/String;

.field public l:Ljava/lang/String;

.field public m:I

.field public n:I

.field public o:Ljava/util/List;

.field public p:Lie4;

.field public q:J

.field public r:Z

.field public s:I

.field public t:I

.field public u:I

.field public v:I

.field public w:F

.field public x:I

.field public y:F

.field public z:[B


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lxm3;->g:Lvm3;

    .line 3
    sget-object v0, Lsn3;->j:Lsn3;

    .line 4
    iput-object v0, p0, Lgg4;->c:Lxm3;

    const/4 v0, -0x1

    iput v0, p0, Lgg4;->g:I

    iput v0, p0, Lgg4;->h:I

    iput v0, p0, Lgg4;->m:I

    iput v0, p0, Lgg4;->n:I

    const-wide v1, 0x7fffffffffffffffL

    iput-wide v1, p0, Lgg4;->q:J

    iput v0, p0, Lgg4;->s:I

    iput v0, p0, Lgg4;->t:I

    iput v0, p0, Lgg4;->u:I

    iput v0, p0, Lgg4;->v:I

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Lgg4;->w:F

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, p0, Lgg4;->y:F

    iput v0, p0, Lgg4;->A:I

    iput v0, p0, Lgg4;->C:I

    iput v0, p0, Lgg4;->D:I

    iput v0, p0, Lgg4;->E:I

    iput v0, p0, Lgg4;->F:I

    iput v0, p0, Lgg4;->I:I

    const/4 v0, 0x1

    iput v0, p0, Lgg4;->J:I

    const/4 v0, 0x0

    iput v0, p0, Lgg4;->K:I

    return-void
.end method

.method public synthetic constructor <init>(Lph4;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lph4;->a:Ljava/lang/String;

    iput-object v0, p0, Lgg4;->a:Ljava/lang/String;

    iget-object v0, p1, Lph4;->b:Ljava/lang/String;

    iput-object v0, p0, Lgg4;->b:Ljava/lang/String;

    iget-object v0, p1, Lph4;->c:Lxm3;

    iput-object v0, p0, Lgg4;->c:Lxm3;

    iget-object v0, p1, Lph4;->d:Ljava/lang/String;

    iput-object v0, p0, Lgg4;->d:Ljava/lang/String;

    iget v0, p1, Lph4;->e:I

    iput v0, p0, Lgg4;->e:I

    iget v0, p1, Lph4;->f:I

    iput v0, p0, Lgg4;->f:I

    iget v0, p1, Lph4;->g:I

    iput v0, p0, Lgg4;->g:I

    iget v0, p1, Lph4;->h:I

    iput v0, p0, Lgg4;->h:I

    iget-object v0, p1, Lph4;->j:Ljava/lang/String;

    iput-object v0, p0, Lgg4;->i:Ljava/lang/String;

    iget-object v0, p1, Lph4;->k:Lwn1;

    iput-object v0, p0, Lgg4;->j:Lwn1;

    iget-object v0, p1, Lph4;->l:Ljava/lang/String;

    iput-object v0, p0, Lgg4;->k:Ljava/lang/String;

    iget-object v0, p1, Lph4;->m:Ljava/lang/String;

    iput-object v0, p0, Lgg4;->l:Ljava/lang/String;

    iget v0, p1, Lph4;->n:I

    iput v0, p0, Lgg4;->m:I

    iget v0, p1, Lph4;->o:I

    iput v0, p0, Lgg4;->n:I

    iget-object v0, p1, Lph4;->p:Ljava/util/List;

    iput-object v0, p0, Lgg4;->o:Ljava/util/List;

    iget-object v0, p1, Lph4;->q:Lie4;

    iput-object v0, p0, Lgg4;->p:Lie4;

    iget-wide v0, p1, Lph4;->r:J

    iput-wide v0, p0, Lgg4;->q:J

    iget-boolean v0, p1, Lph4;->s:Z

    iput-boolean v0, p0, Lgg4;->r:Z

    iget v0, p1, Lph4;->t:I

    iput v0, p0, Lgg4;->s:I

    iget v0, p1, Lph4;->u:I

    iput v0, p0, Lgg4;->t:I

    iget v0, p1, Lph4;->v:I

    iput v0, p0, Lgg4;->u:I

    iget v0, p1, Lph4;->w:I

    iput v0, p0, Lgg4;->v:I

    iget v0, p1, Lph4;->x:F

    iput v0, p0, Lgg4;->w:F

    iget v0, p1, Lph4;->y:I

    iput v0, p0, Lgg4;->x:I

    iget v0, p1, Lph4;->z:F

    iput v0, p0, Lgg4;->y:F

    iget-object v0, p1, Lph4;->A:[B

    iput-object v0, p0, Lgg4;->z:[B

    iget v0, p1, Lph4;->B:I

    iput v0, p0, Lgg4;->A:I

    iget-object v0, p1, Lph4;->C:Ln74;

    iput-object v0, p0, Lgg4;->B:Ln74;

    iget v0, p1, Lph4;->D:I

    iput v0, p0, Lgg4;->C:I

    iget v0, p1, Lph4;->E:I

    iput v0, p0, Lgg4;->D:I

    iget v0, p1, Lph4;->F:I

    iput v0, p0, Lgg4;->E:I

    iget v0, p1, Lph4;->G:I

    iput v0, p0, Lgg4;->F:I

    iget v0, p1, Lph4;->H:I

    iput v0, p0, Lgg4;->G:I

    iget v0, p1, Lph4;->I:I

    iput v0, p0, Lgg4;->H:I

    iget v0, p1, Lph4;->J:I

    iput v0, p0, Lgg4;->I:I

    iget v0, p1, Lph4;->K:I

    iput v0, p0, Lgg4;->J:I

    iget p1, p1, Lph4;->L:I

    iput p1, p0, Lgg4;->K:I

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 0

    .line 1
    iput p1, p0, Lgg4;->G:I

    .line 2
    .line 3
    return-void
.end method

.method public final b()Lph4;
    .locals 1

    .line 1
    new-instance v0, Lph4;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lph4;-><init>(Lgg4;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final c(I)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lgg4;->a:Ljava/lang/String;

    .line 6
    .line 7
    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lpp1;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lgg4;->k:Ljava/lang/String;

    .line 6
    .line 7
    return-void
.end method

.method public final e(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lpp1;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lgg4;->l:Ljava/lang/String;

    .line 6
    .line 7
    return-void
.end method
