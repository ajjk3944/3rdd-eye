.class final LD3/c;
.super LD3/S;
.source "SourceFile"


# instance fields
.field private final c:LD3/e;


# direct methods
.method constructor <init>(LD3/e;I)V
    .locals 1

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-direct {p0, v0, p2}, LD3/S;-><init>(II)V

    iput-object p1, p0, LD3/c;->c:LD3/e;

    return-void
.end method


# virtual methods
.method protected final a(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LD3/c;->c:LD3/e;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
