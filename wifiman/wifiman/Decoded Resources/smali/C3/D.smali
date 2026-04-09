.class final LC3/D;
.super LC3/B;
.source "SourceFile"


# instance fields
.field private final c:LC3/F;


# direct methods
.method constructor <init>(LC3/F;I)V
    .locals 1

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-direct {p0, v0, p2}, LC3/B;-><init>(II)V

    iput-object p1, p0, LC3/D;->c:LC3/F;

    return-void
.end method


# virtual methods
.method protected final a(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LC3/D;->c:LC3/F;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
